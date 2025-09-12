import java.util.Scanner;

public class TriangleValidity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side a: ");
        int a = sc.nextInt();

        System.out.print("Enter side b: ");
        int b = sc.nextInt();

        System.out.print("Enter side c: ");
        int c = sc.nextInt();

        // Check triangle validity
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("The sides form a VALID Triangle");
        } else {
            System.out.println("The sides do NOT form a Triangle");
        }

        sc.close();
    }
}
