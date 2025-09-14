import java.util.Scanner;

public class PermutationCombination {

    public static int factorial(int x) {
        int fact = 1;
        for (int i = 1; i <= x; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int permutation(int n, int r) {
        return factorial(n) / factorial(n - r);
    }

    public static int combination(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Enter r: ");
        int r = sc.nextInt();

        if (r > n) {
            System.out.println("Invalid input! r cannot be greater than n.");
        } else {
            System.out.println("nCr: " + combination(n, r));
            System.out.println("nPr: " + permutation(n, r));
        }

        sc.close();
    }
}
