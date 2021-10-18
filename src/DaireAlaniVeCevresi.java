import java.util.Scanner;
public class DaireAlaniVeCevresi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r, a;
        double alan;
        System.out.print("Yarıçap giriniz: ");
        r = input.nextInt();
        System.out.println("Daire alanı: " + (Math.PI * r * r));
        System.out.println("Dairenin çevresi: " + (2 * Math.PI * r));
        System.out.print("Merkez açı ölçüsü giriniz: ");
        a = input.nextInt();
        alan = (Math.PI * (r * r) * a) / 360;
        System.out.println("Daire diliminin alanı: " + alan);
    }
}
