import java.util.Scanner;

public class StarRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the No. of Rows : ");
        int n = sc.nextInt();

        System.out.print("Enter the No. of Columns : ");
        int m = sc.nextInt();
        System.out.println();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (true) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}

/*
**********
**********
**********
**********
**********
*/
