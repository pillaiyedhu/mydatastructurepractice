package datastructures.arrays;

import java.util.Arrays;

public class _06_RotateArrayByNPlaces {

    public static void reverseArray(int[] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotateArrayByDPlace(int[] arr, int d){
        int n = arr.length;
        int j = n-d-1;
        reverseArray(arr,0,j);
        reverseArray(arr,j+1,n-1);
        reverseArray(arr,0,n-1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int d = 2;
        rotateArrayByDPlace(arr,d);
        System.out.println(Arrays.toString(arr));
    }
}
