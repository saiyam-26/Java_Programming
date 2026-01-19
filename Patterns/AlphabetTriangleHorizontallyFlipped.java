import java.util.Scanner;

public class AlphabetTriangleHorizontallyFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the No. of Rows : ");
        int n = sc.nextInt();
        System.out.println();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= n + 1 - i) {
                    System.out.print((char)(j + 96) + " "); // 97 = 'a'
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

a b c d 
a b c   
a b     
a       

*/
