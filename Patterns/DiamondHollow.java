import java.util.Scanner;

public class DiamondHollow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the No. of Rows : ");
        int n = sc.nextInt();
        System.out.println();
        
        // upper half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) {
                if (j == n + 1 - i || j == n - 1 + i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        // lower half
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) {
                if (j == i + 1 || j == 2 * n - 1 - i) {
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
Example Output if n = 5:

Enter the No. of Rows : 5

    *    
   * *   
  *   *  
 *     * 
*       *
 *     * 
  *   *  
   * *   
    *    
*/
