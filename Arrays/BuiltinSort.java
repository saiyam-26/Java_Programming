import java.util.Arrays;
public class BuiltinSort {
    public static void main(String[] args) {

        int[] arr = {1,3,3,6,8,5,2,9};
        print(arr);
        
        Arrays.sort(arr);
        System.out.println(" ");
        print(arr);
    }

        public static void print(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] +" ");
        }
    }
}