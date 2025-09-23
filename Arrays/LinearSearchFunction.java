class LinearSearchFunction {
    public static void main(String[] args) {
        int[] arr = {1,3,3,6,8,5,2,9};

        Linearsearch(arr, 5);
        print(arr);
    }
    
    public static void print(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] +" ");
        }
    }

    public static int Linearsearch(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target) return i;
            
        }
        return -1;
    }
}