import java.util.Scanner;

public class DesignMethod {
    static int Design(int a, int b) {
        if (a > 0) {
            System.out.print(a + " ");
            return Design((a - 5), b);
        } else {
            System.out.print(a + " ");
            while (a != b) {
                a += 5;
                System.out.print(a + " ");
            }
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        System.out.print("Output: ");
        Design(n, n);
    }
}
