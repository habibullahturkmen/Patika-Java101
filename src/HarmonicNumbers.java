import java.util.*;

public class HarmonicNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int number = input.nextInt();
        double finalResult = 0;

        for (int iter = 1; iter <= number; iter++){
            finalResult += 1.0 / iter;
        }

        System.out.print("Final Result: " + finalResult);
    }
}
