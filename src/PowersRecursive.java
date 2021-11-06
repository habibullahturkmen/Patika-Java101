import java.util.Scanner;

public class PowersRecursive {
    static int power(int number, int power) {
        if(power == 0) {
            return 1;
        } else {
            return number * (power(number, power - 1));
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.print("Enter its power: ");
        int power = input.nextInt();
        System.out.println(power(number, power));
    }
}

