import java.util.*;

public class NumbersAndPowers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        System.out.print("Enter its power: ");
        int pow = input.nextInt();

        int result = 1;
        for(int i = 0; i < pow; i++) {
            result *= num;
        }

        System.out.print("result: " + result);
    }
}
