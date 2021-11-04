import java.util.*;

public class DivisionAssignment {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int n = input.nextInt();
        System.out.print("girdiğiniz sayıya kadar olan çift sayılar: ");
        int k = 1;
        double t = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            if (i % 3 == 0 && i % 4 == 0 && i != 0) {
                t = t + i;
                k++;
            }
        }

        double a = t / k;
        System.out.println("\n3'e ve 4'e tam bölünen sayıların ortalamaları: " + a);
    }
}
