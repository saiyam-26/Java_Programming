import java.util.Scanner;

public class FourDigitCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Check if number is 4-digit (positive only)
        if (num > 999 && num < 10000) {
            System.out.println(num + " is a 4-digit number");
        } else {
            System.out.println(num + " is NOT a 4-digit number");
        }

        sc.close();
    }
}
