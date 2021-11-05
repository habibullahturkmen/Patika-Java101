import java.util.*;

public class Stars {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.println();
        for(int i = 0; i <= number; i++) {
            n(number, i);
        }

        for(int i = number; i >= 0; i--) {
            n(number, i);
        }
    }

    private static void n(int number, int i) {
        for (int j = 0; j < number - i; j++) {
            System.out.print(" ");
        }

        for (int k = 1; k <= 2 * i + 1;k++) {
            System.out.print("*");
        }
        System.out.println(" ");
    }
}
