import java.util.Arrays;

public class ShallowCopyDeepCopy {
    public static void main(String[] args) {
        
        // ---------- Shallow Copy ----------
        int[] arr1 = {10, 20, 30, 40};
        int[] shallow = arr1;  // shallow copy (same reference)
        shallow[0] = 100;      // modifies arr1 as well
        System.out.println("Shallow Copy Example:");
        System.out.println("arr1[0] = " + arr1[0]); // prints 100
        

        // ---------- Deep Copy ----------
        int[] arr2 = {10, 20, 30, 40};
        int[] deep = Arrays.copyOf(arr2, arr2.length); // deep copy (new array)
        deep[0] = 100;        // does not affect arr2
        System.out.println("\nDeep Copy Example:");
        System.out.println("arr2[0] = " + arr2[0]); // prints 10
    }
}
