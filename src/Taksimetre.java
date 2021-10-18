import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double t, kmP = 2.20, sP = 10;
        System.out.print("Kilometre giriniz: ");
        int km = input.nextInt();
        t = sP + (km * kmP);
        boolean durum = t <= 20;
        System.out.println("Ödenecek tutar: " + (durum ? "20" : t));
    }
}
