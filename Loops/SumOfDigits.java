import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;
        int num = n; // store original number

        while (n != 0) {
            int lastdigit = n % 10;   // last digit
            sum += lastdigit;        // add to sum
            n = n / 10;          // remove last digit
        }

        System.out.println("Sum of digits of " + num + " = " + sum);

        sc.close();
    }
}
