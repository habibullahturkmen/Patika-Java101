import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double a = input.nextDouble();
        System.out.print("Enter the second number: ");
        double b = input.nextDouble();

        System.out.println("Choose an operation: ");
        System.out.println("1: Addition\n2: Subtraction\n3: Multiplication\n4: Division");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Addition results: " + (a + b));
                break;
            case 2:
                System.out.println("Subtraction Results: " + (a - b));
                break;
            case 3:
                System.out.println("Multiplication Results: " + (a * b));
                break;
            case 4:
                if(b == 0) {
                    System.out.println("Division by 0 isn't allowed!");
                }
                else{
                    System.out.println("Division Results: " + (a / b));
                }
                break;
            default:
                System.out.println("Error!");
                break;
        }
    }
}
