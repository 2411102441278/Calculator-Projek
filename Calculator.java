import java.util.Scanner;

public class Calculator {

    // Fungsi operasi matematika
    public static int add(int a, int b) { return a + b; }
    public static int subtract(int a, int b) { return a - b; }
    public static int multiply(int a, int b) { return a * b; }
    public static double divide(int a, int b) {
        if (b == 0) throw new IllegalArgumentException("Cannot divide by zero!");
        return (double) a / b;
    }

    // Entry point program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Choose operation (+, -, *, /): ");
        char op = scanner.next().charAt(0);

        double result = 0;
        switch (op) {
            case '+': result = add(num1, num2); break;
            case '-': result = subtract(num1, num2); break;
            case '*': result = multiply(num1, num2); break;
            case '/': result = divide(num1, num2); break;
            default: System.out.println("Invalid operation!"); return;
        }

        System.out.println("Result: " + result);
    }
}
