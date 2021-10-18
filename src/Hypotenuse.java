import java.util.Scanner;
public class Hypotenuse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("2 kenar uzunluğu giriniz : ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = Math.sqrt((a * a) + (b * b));
        System.out.println("Hipotenüs uzunluğu: " + c);
        double u = (a + b + c) / 2;
        System.out.println("Üçgenin çevresi: " + 2 * u);
        double alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println("Üçgenin alanı: " + alan);
    }
}
