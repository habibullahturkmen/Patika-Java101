import java.util.*;

public class PassingAClass {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int count = 5;

        System.out.print("Mathematics grades: ");
        int mathematics = input.nextInt();

        if(mathematics < 0 || mathematics > 100) {
            mathematics = 0;
            count--;
        }

        System.out.print("Physics grades: ");
        int physics = input.nextInt();

        if(physics < 0 || physics > 100) {
            physics = 0;
            count--;
        }

        System.out.print("Turkish grades: ");
        int turkish = input.nextInt();

        if(turkish < 0 || turkish > 100) {
            turkish = 0;
            count--;
        }

        System.out.print("Chemistry grades: ");
        int chemistry = input.nextInt();

        if(chemistry < 0 || chemistry > 100) {
            chemistry = 0;
            count--;
        }

        System.out.print("Music grades: ");
        int music = input.nextInt();

        if(music < 0 || music > 100) {
            music = 0;
            count--;
        }

        double average = (double) (mathematics + physics + turkish + chemistry + music) / count;
        System.out.println("Average grades: " + average);

        if (average <= 55) {
            System.out.print("You failed the class");
        } else {
            System.out.print("You passed the class");
        }
    }
}
