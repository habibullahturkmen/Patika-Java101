import java.util.*;

public class UserLogin {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("UserName: ");
        String username = input.nextLine();
        System.out.print("Password: ");
        String password = input.nextLine();

        if (username.equals("habib") && password.equals("habib1234"))
            System.out.println("Login Successful");
        else {
            System.out.println("Login Unsuccessful");
            if (!username.equals("habib")) {
                System.out.println("Wrong UserName");
            }

            if (!password.equals("habib1234")) {
                System.out.println("Wrong Password");
                System.out.println("Would you like to reset your password: Y/N");
                String choice = input.nextLine();
                if (Objects.equals(choice, "Y")) {
                    System.out.println("Enter New Password: ");
                    String newPassword = input.nextLine();
                    if (newPassword.equals("habib1234"))
                        System.out.println("Password reset failed. Enter password that is not used before.");
                    else {
                        System.out.println("Password Reset Successful");
                        password = newPassword;
                    }
                }
                else {
                    System.out.println("Try again");
                }
            }
        }
    }
}
