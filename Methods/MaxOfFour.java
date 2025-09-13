import java.util.Scanner;

public class MaxOfFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        System.out.print("Enter fourth number: ");
        int d = sc.nextInt();

        int max = Math.max(Math.max(a, b), Math.max(c, d));

        System.out.println("Maximum of " + a + ", " + b + ", " + c + ", " + d + " = " + max);

        sc.close();
    }
}
