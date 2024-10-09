package datastructures.arrays;

//brute force approach find all permutation and print next
//optimal approach
//3 observations eg : 2154300
//    1. start from behind check small than previous like 0 is small than  0 no 5 is smaller than 4 no .... 1 is smaller than 5 yes
//    2. replace 1 with next small element greater than 1 here next small is 3 so new array is 2354100
//    3. but this is not the next permutation you need to reverse the remaining elements to make it small so ans is 2300145

import java.util.Arrays;
import java.util.Collections;

public class _21_NextPermutation {
    public static void reverse(int start,int end, int[] arr){
        while(start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void findNextPermutation(int[] arr){
        int n = arr.length;
        int breakIndex = -1;
        for(int i =n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                breakIndex = i;
                break;
            }
        }

        if(breakIndex==-1){
            reverse(0,n-1,arr);
            return;
        }

        for(int i=n-1;i>breakIndex;i--){
            if(arr[i]>arr[breakIndex]){
                int temp =arr[i];
                arr[i] = arr[breakIndex];
                arr[breakIndex] = temp;
                break;
            }
        }

        reverse(breakIndex+1,n-1,arr);
    }

    public static void main(String[] args) {
        int[] arr = {2,1,5,4,3,0,0};
        findNextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }
}
