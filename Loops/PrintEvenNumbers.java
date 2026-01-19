import java.util.Scanner;

class PrintEvenNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Method 1: Using continue");
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("Method 2: Using i += 2");
        for (int i = 2; i <= n; i += 2) {
            System.out.print(i + " ");
        }
    }
}
