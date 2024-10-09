package datastructures.arrays;

import java.util.Arrays;

//brute force approch use arrays and store negative and positve elements and then put it back
public class _19_AlternativePositiveAndNegative {

    public static int[] rearrange(int[] arr){
        int indexPos = 0;
        int indexNeg = 1;
        int[] newArr = new int[arr.length];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                if(indexPos< arr.length){
                    newArr[indexPos] = arr[i];
                    indexPos = indexPos+2;
                }
            }
            if(arr[i]<0){
                if(indexNeg< arr.length){
                    newArr[indexNeg] = arr[i];
                    indexNeg = indexNeg+2;
                }
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr={-1,2,2,9,-1,-2,3};
        int[] ans = rearrange(arr);
        System.out.println(Arrays.toString(ans));
    }
}
