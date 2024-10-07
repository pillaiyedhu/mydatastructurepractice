package datastructures.arrays;

import java.util.Arrays;

public class _07_MoveZerosToEnd {
    public static void moveZerosToEnd(int[] arr){
        int j=-1;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }

        if(j==-1) return;

        for(int i=j+1;i< arr.length;i++){
            if(arr[i]!=0){
                int temp =arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,0,4,5,0,7};
        moveZerosToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }
}
