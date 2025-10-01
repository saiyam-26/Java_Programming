// class solution{
//     void segregate0and1(int[] arr){
        
//         int n = arr.length;
//         int numberOfZeroes = 0;
//         int numberOfOnes = 0;

//         for(int ele : arr){
//             if(ele == 0) numberOfZeroes++;
//             else numberOfOnes++;
//         }

//         for (int i = 0; i < numberOfZeroes; i++){
//             arr[i] = 0;
//         }

//         for (int i = numberOfZeroes; i < arr.length; i++){
//             arr[i] = 1;
//         }
//     }
// }




// class solution{
//     void segregate0and1(int[] arr){

//         int n = arr.length;
//         int i = 0;
//         int j = n - 1;

//         while (i < j) { 
            
//             if(arr[i] == 0) i++;
//             else if(arr[j] == 1) j--;


//             else if(arr[i] == 1 && arr[j] == 0){
//                 arr[i] = 0;
//                 arr[j] = 1;
//             }
//         }
//     }
// }