import java.util.Scanner;

public class NumberTriangleHorizontallyFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the No. of Rows : ");
        int n = sc.nextInt();
        System.out.println();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= n + 1 - i) {
                    System.out.print(j + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}

/*
Example for n = 4:

1 2 3 4 
1 2 3   
1 2     
1       

*/
