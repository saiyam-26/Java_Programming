import java.util.Scanner;

public class AlphabetTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the No. of Rows : ");
        int n = sc.nextInt();
        System.out.println();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= i) {
                    System.out.print((char)(j + 64) + " ");  // 65 = 'A'
                } else {
                    System.out.print("  ");  // two spaces for alignment
                }
            }
            System.out.println();
        }

        sc.close();
    }
}

/*
Example for n = 4:
A 
A B 
A B C 
A B C D 
*/
