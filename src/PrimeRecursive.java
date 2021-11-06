import java.util.Scanner;

public class PrimeRecursive {
    static int isPrime(int a, int b){
        if(a < 2) {
            return -1;
        } else if(b == 1) {
            return 1;
        } else if(a % b == 0) {
            return 0;
        }
        return isPrime(a,b - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = input.nextInt();
        int result = isPrime(x,x / 2);
        if(result == 0) {
            System.out.println(x + " is not a prime number");
        } else if(result == -1) {
            if (x == 0) {
                System.out.println(x + " is not a prime number");
            } else if (x == 1) {
                System.out.println(x + " is not a prime number");
            } else {
                System.out.println(x + " is not a prime number");
            }
        } else {
            System.out.println(x + " is a prime number");
        }
    }
}
