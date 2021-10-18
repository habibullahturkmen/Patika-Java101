import java.util.Scanner;

public class VucutKitleIndeksiHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Boyunuzu metre cinsinden giriniz: ");
        double boy = input.nextFloat();
        System.out.print("Kilonuzu kg cinsinden giriniz: ");
        double kilo = input.nextInt();
        double v = (kilo / (boy * boy));
        System.out.print("Vücut kitle indeksiniz: " + v);
    }
}
