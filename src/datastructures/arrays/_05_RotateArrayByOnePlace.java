package datastructures.arrays;

import java.util.Arrays;

public class _05_RotateArrayByOnePlace {

    public static void rotateArrayByOnePlace(int[] arr){
        int temp = arr[0];
        for(int i=1;i< arr.length;i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,6,8};
        rotateArrayByOnePlace(arr);
        System.out.println(Arrays.toString(arr));
    }
}
