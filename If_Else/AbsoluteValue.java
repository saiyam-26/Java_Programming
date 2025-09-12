import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        if (n < 0) {
            n = -n; // convert negative to positive
        }

        System.out.println("Absolute value = " + n);

        sc.close();
    }
}
