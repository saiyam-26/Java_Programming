class Solution {
    public static int[] rowSum(int mat[][]) {
        
        int[] ans = new int[mat.length];
        int sum = 0;
        
        for (int i = 0; i < mat[0].length; i++) {
            sum = 0;
            for (int j = 0; j < mat.length; j++) {
                sum += mat[j][i];
                ans[i] =sum;
                
            }
        }
        return ans;
    
        
    }
}