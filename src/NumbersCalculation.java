import java.util.*;

public class NumbersCalculation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int i;
        int j;
        int single = 0;
        int four = 0;

        do {
            System.out.print("Sayıyı Giriniz (kapatmat icin 0 giriniz): ");
            i = input.nextInt();

            if (i % 2 == 1) {
                single = single + i;
            }

        } while (i > 0);

        System.out.println("Tek Sayıların Toplamı: " + single);

        do {
            System.out.print("Sayıyı Giriniz (kapatmat icin 0 giriniz): ");
            j = input.nextInt();

            if (j % 4 == 0) {
                four += j;
            }

        } while(j > 0);

        System.out.println("4'e Bölünen Sayıların Toplamı: " + four);
    }
}
