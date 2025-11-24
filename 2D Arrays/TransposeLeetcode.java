class Solution {
    public int[][] transpose(int[][] arr) {
        int cols = arr[0].length;
        int rows = arr.length;
        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[0].length; j++) {
                transpose[i][j] = arr[j][i];
            }
        }
        return transpose;
    }
}