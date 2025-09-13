import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        long fact = 1; // use long to avoid overflow for bigger n
        int num = n;

        while (n > 0) {
            fact = fact * n;
            n--;
        }

        System.out.println("Factorial of " + num + " = " + fact);

        sc.close();
    }
}
