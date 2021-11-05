import java.util.*;

public class PalindromeNumber {

    static boolean isPalindrome(int number) {
        int temp = number;
        int reverseNum = 0;
        int last;
        while (temp != 0) {
            last = temp % 10;
            reverseNum = reverseNum * 10 + last;
            temp /= 10;
        }
        return number == reverseNum;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.println(isPalindrome(number));
    }
}
