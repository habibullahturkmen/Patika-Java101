import java.util.*;

public class MinAndMax {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç Tane Sayı Gireceksiniz: ");
        int n = input.nextInt();

        System.out.print("Sayıyı Giriniz: ");
        int m = input.nextInt();

        int min = m;
        int max = m;

        while(n != 1) {
            System.out.print("Sayıyı Giriniz: ");
            m = input.nextInt();

            if(m < min) {
                min = m;
            }

            if(m > max) {
                max = m;
            }

            n--;
        }

        System.out.println("Minimum: " + min);
        System.out.println("Maksimum: " + max);
    }
}
