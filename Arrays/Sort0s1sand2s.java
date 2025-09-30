// class Solution {
//     public void sort012(int[] arr) {
        
//         int numberOfZeroes = 0;
//         int numberOfOnes = 0;
//         int numberOfTwos = 0;
        
//         for(int ele : arr){
//             if(ele == 0) numberOfZeroes++;
//             else if(ele == 1) numberOfOnes++;
//             else numberOfTwos++;
//         }
        
//         for(int i = 0 ; i < numberOfZeroes; i++) arr[i] = 0;
//         for(int i = numberOfZeroes ; i < numberOfZeroes + numberOfOnes; i++) arr[i] = 1;
//         for(int i = numberOfZeroes + numberOfOnes ; i < arr.length; i++) arr[i] = 2;
        
//     }
// }