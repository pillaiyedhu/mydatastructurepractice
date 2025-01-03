package datastructures.arrays;

//brute force approach is get all the subarray and find sum and get the max value
//this algo is called kadane algo
public class _17_MaxSumOfSubArray {
    public static void maxSumSubArray(int[] arr){
        int sum = 0;
        int maxSum = 0;
        int start = 0;
        int end = 0;
        int tempStart =0;
        for(int i=0;i< arr.length;i++){
            sum = sum + arr[i];
            if(sum >= maxSum){
                maxSum = sum;
                start = tempStart;
                end = i;
            }
            if(sum < 0){
                sum = 0;
                tempStart = i+1;
            }
        }


        for (int i=start;i<=end;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("maxSum = " +maxSum);
    }

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        maxSumSubArray(arr);
    }
}
