import java.util.Scanner;

public class GPSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 1;   // first term
        int r = 2;   // common ratio

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();  // kitne terms chahiye

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            a *= r;  // next term
        }
    }
}

