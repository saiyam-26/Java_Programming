import java.util.Scanner;

public class APSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int a = 2;   // first term
        int d = 3;   // common difference

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            a += d;   // next term
        }

        sc.close();
    }
}
