public class MergeTwoSortedArrays{
    public static void main (String[] args) {
        
        int[] a = {1,3,5,7,9};
        int[] b = {2,4,6,8,10,15,20};
        int[] c = new int[a.length + b.length];
        
        Merge(c,a,b);
        
        for(int ele : c){
            System.out.print(ele + " ");
        }
    }
    
    public static void Merge(int[] c, int[] a, int[] b){
        int i = 0;
        int j = 0;
        int k = 0;
        
        while(i < a.length && j < b.length){
            if(a[i] < b[j]){
                c[k] = a[i];
                i++;
                k++;
            }
            else{
                c[k] = b[j];
                k++;
                j++;
            }
        }
        
        while(i < a.length){
            c[k] = a[i];
            i++;
            k++;
        }
        while(j < b.length){
            c[k] = b[j];
            j++;
            k++;
        }
    }
}