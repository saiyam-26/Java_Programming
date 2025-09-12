import java.util.Scanner;

public class IsInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = sc.nextDouble();

        // Convert double to int
        int integerPart = (int) number;

        // Check if number is an integer
        if (number - integerPart == 0) {
            System.out.println(number + " is an Integer");
        } else {
            System.out.println(number + " is NOT an Integer");
        }

        sc.close();
    }
}
