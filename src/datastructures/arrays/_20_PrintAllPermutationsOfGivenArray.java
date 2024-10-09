package datastructures.arrays;

import java.util.ArrayList;
import java.util.List;

public class _20_PrintAllPermutationsOfGivenArray {
    public static void swap(int index1, int index2, int[] arr){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void getPermutation(int startIndex, int[] arr, List<List<Integer>> ans){
        if(startIndex==arr.length){
            List<Integer> currentVal = new ArrayList<>();
            for(int num : arr){
                currentVal.add(num);
            }
            ans.add(currentVal);
        }

        for(int i=startIndex;i<arr.length;i++){
            swap(i,startIndex,arr);
            getPermutation(startIndex+1,arr,ans);
            swap(i,startIndex,arr);
        }
    }

    public static List<List<Integer>> printPermutation(int[] arr){
        List<List<Integer>> ans = new ArrayList<>();
        getPermutation(0,arr,ans);
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2,1,3};
        List<List<Integer>> ans = printPermutation(arr);
        System.out.println(ans);
    }
}
