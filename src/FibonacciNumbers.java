import java.util.*;

public class FibonacciNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt() + 1;

        int numberOne = 0, numberTwo = 1;
        System.out.print(numberOne + " " + numberTwo);

        for (int iter = 2; iter < number; iter++) {
            int numberThree = numberOne + numberTwo;
            System.out.print(" " + numberThree);
            numberOne = numberTwo;
            numberTwo = numberThree;
        }
    }
}
