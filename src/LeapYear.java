import java.util.*;

public class LeapYear {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Yıl Giriniz: ");
        int year = input.nextInt();

        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println( year + " Bir Artık Yıl!");
        } else {
            System.out.println( year + " Bir Artık Yıl Değil!");
        }
    }
}
