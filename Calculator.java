import java.util.Scanner;

public class Calculator {

    // Konstanta untuk operasi
    private static final char ADD = '+';
    private static final char SUBTRACT = '-';
    private static final char MULTIPLY = '*';
    private static final char DIVIDE = '/';

    // Fungsi operasi matematika
    public static int add(int firstNumber, int secondNumber) { return firstNumber + secondNumber; }
    public static int subtract(int firstNumber, int secondNumber) { return firstNumber - secondNumber; }
    public static int multiply(int firstNumber, int secondNumber) { return firstNumber * secondNumber; }
    public static double divide(int firstNumber, int secondNumber) {
        if (secondNumber == 0) throw new IllegalArgumentException("Cannot divide by zero!");
        return (double) firstNumber / secondNumber;
    }

    // Fungsi input angka
    private static int getNumberInput(Scanner scanner, String message) {
        System.out.print(message);
        return scanner.nextInt();
    }

    // Fungsi input operasi
    private static char getOperationInput(Scanner scanner) {
        System.out.print("Choose operation (+, -, *, /): ");
        return scanner.next().charAt(0);
    }

    // Entry point program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = getNumberInput(scanner, "Enter first number: ");
        int secondNumber = getNumberInput(scanner, "Enter second number: ");
        char operation = getOperationInput(scanner);

        double result;
        switch (operation) {
            case ADD: result = add(firstNumber, secondNumber); break;
            case SUBTRACT: result = subtract(firstNumber, secondNumber); break;
            case MULTIPLY: result = multiply(firstNumber, secondNumber); break;
            case DIVIDE: result = divide(firstNumber, secondNumber); break;
            default: System.out.println("Invalid operation!"); return;
        }

        System.out.println("Result: " + result);
    }
}
