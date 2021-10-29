import java.util.Scanner;

public class WeatherApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weather temperature: ");
        int temperature = input.nextInt();

        // first solution
        System.out.print("You can ");
        if(temperature < 5)
            System.out.println("Ski");
        if(temperature >= 5 && temperature < 15)
            System.out.println("go to Cinema");
        if(temperature >= 15 && temperature < 25)
            System.out.println("go to Picnic");
        if(temperature >= 25)
            System.out.println("Swim");

        // second solution
        System.out.print("You can ");
        boolean condition1 = (temperature < 5);
        boolean condition2 = (temperature >= 5 && temperature < 15);
        boolean condition3 = (temperature >= 15 && temperature < 25);
        System.out.println(condition1 ? "Ski": condition2 ? "go to Cinema": condition3 ? "go to Picnic": "Swim");
    }
}
