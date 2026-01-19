import java.util.Scanner;

public class BinaryTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the No. of Rows : ");
        int n = sc.nextInt();
        System.out.println();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= i) {
                    // Alternate 1 and 0 based on sum of row and column index
                    System.out.print(( (i + j) % 2 ) + " ");
                } else {
                    System.out.print("  "); // spaces for alignment
                }
            }
            System.out.println();
        }

        sc.close();
    }
}

/*
Example for n = 4:

1 
0 1 
1 0 1 
0 1 0 1 
*/
