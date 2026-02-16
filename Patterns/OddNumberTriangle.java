import java.util.Scanner;

public class OddNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the No. of Rows : ");
        int n = sc.nextInt();
        System.out.println();

        for (int i = 1; i <= n; i++) {
            int a = 1;
            for (int j = 1; j <= n; j++) {
                if (j <= i) {
                    System.out.print(a);
                    a += 2;
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
Example for n = 5:

1    
13   
135  
1357 
13579
*/
