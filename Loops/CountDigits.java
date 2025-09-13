import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int count = 0;
        int num = n; // store original number

        if (n == 0) {
            count = 1; // special case for 0
        } else {
            while (n > 0) {
                n = n / 10;
                count++;
            }
        }

        System.out.println("Number of digits in " + num + " = " + count);

        sc.close();
    }
}
