import java.util.Scanner;

public class EBOB__EKOK {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int minimum = Math.min(n1, n2);
        int maximum = Math.max(n1, n2);

        int ebobValue = 1;
        int i = 1;
        while (i <= minimum) {
            if(minimum % i == 0 && maximum % i == 0)
            {
                ebobValue = i;
            }
            i++;
        }
        System.out.println("EBOB: " + ebobValue);

        int j = 1;
        while (j <= maximum * minimum) {
            if(j % maximum == 0 && j % minimum == 0) {
                System.out.println("EKOK: " + j);
                break;
            }
            j++;
        }
    }
}
