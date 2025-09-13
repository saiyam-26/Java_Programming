import java.util.Scanner;

public class PrimeComposite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        boolean flag = true; // assume prime by default

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                flag = false; // not prime
                break;
            }
        }

        if (n == 1) {
            System.out.println("1 is neither prime nor composite.");
        } else if (flag) {
            System.out.println(n + " is a Prime number.");
        } else {
            System.out.println(n + " is a Composite number.");
        }

        sc.close();
    }
}
