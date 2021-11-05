import java.util.*;

public class PerfectNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int result = 0;

        for (int iter = 1; iter < number; iter++) {
            if (number % iter == 0) {
                result += iter;
            }
        }

        if (result == number) {
            System.out.println(number + " is a perfect number");
        } else {
            System.out.println(number + " is not a perfect number");
        }
    }
}
