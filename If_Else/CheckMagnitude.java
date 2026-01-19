import java.util.Scanner;

class CheckMagnitude {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Convert to magnitude (absolute value)
        if (n < 0) {
            n = -n;
        }

        // Check magnitude
        if (n < 69) {
            System.out.println("The magnitude is less than 69");
        } else {
            System.out.println("The magnitude is NOT less than 69");
        }
    }
}
