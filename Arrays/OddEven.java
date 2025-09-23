class OddEven   {
    public static void main(String[] args) {
        int[] arr = {1,3,3,6,8,5,2,9};
    
        oddeven(arr);
        print(arr);
    }
    
    public static void print(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] +" ");
        }
    }
    public static void oddeven(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(i % 2 != 0) arr[i] *= 2;
            if(i % 2 == 0) arr[i] += 10;
        }
    }
}