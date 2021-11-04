import java.util.*;

public class Powers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = input.nextInt();

        System.out.println();
        System.out.println("Powers of Two: ");
        int two = 0;
        for (int i = 1; i <= n; i *= 2) {
            System.out.println("2^" + two + " is equal to " + i);
            two++;
        }
        System.out.println();

        System.out.println("Powers of Four: ");
        int four = 0;
        for (int i = 1; i <= n; i *= 4) {
            System.out.println("4^" + four + " is equal to " + i);
            four++;
        }
        System.out.println();

        System.out.println("Powers of Five");
        int five = 0;
        for (int i = 1; i <= n; i *= 5) {
            System.out.println("5^" + five + " is equal to " + i);
            five++;
        }
    }
}
