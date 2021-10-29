import java.util.Scanner;

public class HoroscopeFinder {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Month of birth (enter numbers): ");
        int month = input.nextInt();
        System.out.print("Day of birth: ");
        int day = input.nextInt();

        if (month == 1) {
            if (day < 20) {
                System.out.println("Capricornus (Goat)");
            } else {
                System.out.println("Aquarius (Water Bearer)");
            }
        } else if (month == 2) {
            if (day < 19) {
                System.out.println("Aquarius (Water Bearer)");
            } else {
                System.out.println("Pisces (Fish)");
            }
        } else if(month == 3) {
            if (day < 21) {
                System.out.println("Pisces (Fish)");
            } else {
                System.out.println("Aries (Ram)");
            }
        } else if (month == 4) {
            if (day < 20) {
                System.out.println("Aries (Ram)");
            } else {
                System.out.println("Taurus (Bull)");
            }
        } else if (month == 5) {
            if (day < 21) {
                System.out.println("Taurus (Bull)");
            } else {
                System.out.println("Gemini (Twins)");
            }
        } else if (month == 6) {
            if (day < 22) {
                System.out.println("Gemini (Twins)");
            } else {
                System.out.println("Cancer (Crab)");
            }
        } else if (month == 7) {
            if (day < 23) {
                System.out.println("Cancer (Crab)");
            } else {
                System.out.println("Leo (Lion)");
            }
        } else if (month == 8) {
            if (day <= 22) {
                System.out.println("Leo (Lion)");
            } else {
                System.out.println("Virgo (Virgin)");
            }
        } else if (month == 9) {
            if (day <= 22) {
                System.out.println("Virgo (Virgin)");
            } else {
                System.out.println("Libra (Balance)");
            }
        } else if (month == 10) {
            if (day < 24) {
                System.out.println("Libra (Balance)");
            } else {
                System.out.println("Scorpius (Scorpion)");
            }
        } else if (month == 11) {
            if (day < 22) {
                System.out.println("Scorpius (Scorpion)");
            } else {
                System.out.println("Sagittarius (Archer)");
            }
        } else if (month == 12) {
            if (day < 22) {
                System.out.println("Sagittarius (Archer)");
            } else {
                System.out.println("Capricornus (Goat)");
            }
        } else System.out.println("Wrong input");
    }
}
