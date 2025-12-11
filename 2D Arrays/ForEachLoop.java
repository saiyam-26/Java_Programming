public class ForEachLoop {
    public static void main(String[] args) {
        
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        for (int[] a : arr) {
            for (int e : a) {
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }
}