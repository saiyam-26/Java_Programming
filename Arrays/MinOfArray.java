import java.util.Scanner;

public class MinOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int min = Integer.MAX_VALUE;   
        int[] arr = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }

        System.out.println("Minimum element = " + min );
        sc.close();
    }
}
