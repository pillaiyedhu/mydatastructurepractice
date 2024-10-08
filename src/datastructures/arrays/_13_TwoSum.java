package datastructures.arrays;


import java.util.Arrays;

//approch 1 - use 2 for loops
//approach 2 - sort the array and use two pointers
public class _13_TwoSum {

    public static void twoSum(int[] arr, int k){
        Arrays.sort(arr);
        int left  =0;
        int right = arr.length-1;
        while(left<right){
            if(arr[left]+arr[right] > k){
                right--;
            }
            else if(arr[left]+arr[right]<k){
                left++;
            }
            else{
                System.out.println(arr[left] +","+ arr[right]);
                return;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,0,3,5,4,1};
        int k = 9;
        twoSum(arr,k);
    }
}
