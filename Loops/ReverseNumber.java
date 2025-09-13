import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int rev = 0;
        int num = n; // store original number

        while (n != 0) {
            int digit = n % 10;          // last digit
            rev = rev * 10 + digit;      // add digit to reverse
            n = n / 10;                  // remove last digit
        }

        System.out.println("Reverse of " + num + " = " + rev);

        sc.close();
    }
}
