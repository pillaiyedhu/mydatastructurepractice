package datastructures.arrays;

import java.util.Set;

//brute force approach is using a for loop find the missing number
public class _09_FindTheMissingNumber {

    public static int findTheMissingNumber(int[] arr){
        int n = arr[arr.length-1];
        int sum = (n*(n+1))/2;
        int sum2 = 0;
        for(int i=0;i< arr.length;i++){
            sum2 = sum2 + arr[i];
        }
        if(sum == sum2){
            return -1;
        }
        else{
            return (sum - sum2);
        }

    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,5};

        int ans = findTheMissingNumber(arr);
        System.out.println(ans);
    }
}
