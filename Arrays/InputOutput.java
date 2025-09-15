
import java.util.Scanner;

public  class InputOutput{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[5]; // declaration
		
		for(int i = 0; i < arr.length; i++){ // input
		     arr[i] = sc.nextInt();
		}
		for(int i = 0; i < arr.length; i++){ // output
		    System.out.println(arr[i]);
		    
		}

    }
}