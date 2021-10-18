import java.util.Scanner;

public class NotOrtalamasiHesaplayanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat , fiz, kim, tur, tar,muz;
        System.out.print("Matematik notunuzu giriniz : ");
        mat = input.nextInt();
        System.out.print("Fizik notunuzu giriniz : ");
        fiz = input.nextInt();
        System.out.print("Kimya notunuzu giriniz : ");
        kim = input.nextInt();
        System.out.print("Türkçe notunuzu giriniz : ");
        tur = input.nextInt();
        System.out.print("Tarih notunuzu giriniz : ");
        tar = input.nextInt();
        System.out.print("Müzik notunuzu giriniz : ");
        muz = input.nextInt();
        double ortalama = (mat + fiz + kim + tur + tar + muz) / 6;
        System.out.println("Ortalamanız : " + ortalama);
        System.out.println(ortalama >= 60 ? "Geçti" : "Kaldı");
    }
}