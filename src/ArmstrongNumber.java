import java.util.*;

public class ArmstrongNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int baseNumber = 0;
        int tempNumber = number;

        while (tempNumber != 0) {

            tempNumber /= 10;
            baseNumber++;

        }

        tempNumber = number;
        int nthPower;
        int baseValue;
        int resultOne = 0;

        while (tempNumber != 0){

            baseValue = tempNumber % 10;
            nthPower = 1;

            for (int i = 1; i <= baseNumber; i++){
                nthPower *= baseValue;
            }

            resultOne += nthPower;
            tempNumber /= 10;

        }

        if(resultOne == number) {
            System.out.println("It is Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }

        tempNumber = number;
        int resultTwo = 0;

        while (tempNumber != 0){

            resultTwo += tempNumber % 10;
            tempNumber= tempNumber / 10;

        }

        System.out.println("Total: " + resultTwo);
    }
}
