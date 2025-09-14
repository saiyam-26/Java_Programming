import java.util.Scanner;

public class MaxOfThreeCustom {

    // Function to return maximum of 3 numbers
    static int maxOfThree(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x = sc.nextInt();

        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        System.out.print("Enter third number: ");
        int z = sc.nextInt();

        int result = maxOfThree(x, y, z);
        System.out.println("Maximum is: " + result);

        sc.close();
    }
}
