import java.util.Scanner;

public class KDVTutariHesaplayanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Tutar giriniz : ");
        double tutar = input.nextDouble();
        boolean durum = (tutar <= 1000 && tutar > 0);
        System.out.println("Kdv sonrası tutar :" + (durum ? (tutar + (tutar * 18) / 100) : (tutar + (tutar * 8) / 100)));
    }
}
