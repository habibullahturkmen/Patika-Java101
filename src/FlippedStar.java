import java.util.*;

public class FlippedStar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        for (int iter1 = 0; iter1 < number; iter1++) {
            for (int iter2 = 0; iter2 <= iter1; iter2++) {
                System.out.print(" ");
            }

            for (int iter3 = 2 * number - 1; iter3 >= 2 * iter1 + 1; iter3--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
