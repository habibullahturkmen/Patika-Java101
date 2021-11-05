import java.util.Scanner;

public class Factorials {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        int w = 1;
        for (int i = n; i > 0; i--) {
            w *= i;
        }

        System.out.println(w);

        System.out.print("Enter n's value: ");
        int n1 = input.nextInt();

        System.out.print("Enter r's value: ");
        int r = input.nextInt();

        int x = 1;
        for (int i = n1; i > 0; i--) {
            x *= i;
        }

        int y = 1;
        for (int i = r; i > 0; i--) {
            y *= i;
        }

        int z = 1;
        for (int i = n1 - r; i > 0; i--) {
            z *= i;
        }

        System.out.println("Combination's value: " + (y * z) / x);
    }
}
