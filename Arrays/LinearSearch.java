public class LinearSearch {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        int target = 5;
        boolean flag = false;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                flag = true;
                break;
            }
        }

        if(flag) System.out.println("Element found");
        else System.out.println("Element not found");
    }
}