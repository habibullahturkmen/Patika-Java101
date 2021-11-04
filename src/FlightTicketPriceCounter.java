import java.util.*;

public class FlightTicketPriceCounter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz: ");
        int distance = input.nextInt();

        System.out.print("Yaşınızı Giriniz: ");
        int age = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        int option = input.nextInt();

        if (distance < 0 || age < 0) {
            System.out.println("Hatalı Veri Girdiniz!");
            System.exit(0);
        }

        double price = distance * 0.10;

        if (age < 12) {
            price /= 2;
        } else if (age < 24) {
            price -= price * 10 / 100;
        } else if (age > 65) {
            price -= price * 30 / 100;
        }

        switch (option) {
            case 1:
                System.out.println("Toplam Tutar: " + (int) price + " TL");
                break;
            case 2:
                price = (price - (price * 20 / 100)) * 2;
                System.out.println("Toplam Tutar: " + (int) price + " TL");
                break;
            default:
                System.out.println("Hatalı Veri Girdiniz!");
        }
    }
}
