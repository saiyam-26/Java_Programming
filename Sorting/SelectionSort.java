
public class SelectionSort
{
	public static void main(String[] args) {
		
		int[] arr = {1,-2,4,3,6,8,7,3,-4};
		int n = arr.length;
		
		// Selection sort;
		
		for(int i = 0; i < n - 1 ;i++){
		    int min = Integer.MAX_VALUE;
		    int minidx = 0;
		    for(int j = i ; j < n; j++ ){
		        if(arr[j] < min){
		            min = arr[j];
		            minidx = j;
		        }
		    }
		    int temp = arr[i];
		    arr[i] = arr[minidx];
		    arr[minidx] = temp;
		}
	}
}