import java.util.Scanner;

public class PalindromePyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the No. of Rows : ");
        int n = sc.nextInt();
        System.out.println();
        
        for (int i = 1; i <= n; i++) {
            int k = 1;
            for (int j = 1; j <= 4 + n; j++) {
                if (j >= n + 1 - i && j <= n - 1 + i) {
                    System.out.print(k);
                    if (j < n) {
                        k++;
                    } else {
                        k--;
                    }
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

    1    
   121   
  12321  
 1234321 
123454321
*/
