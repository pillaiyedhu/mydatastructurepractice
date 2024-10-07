package datastructures.arrays;


import java.util.Arrays;

//brute force - hashset use
//optimal - two pointer
public class _04_RemoveDuplicatesFromAnSortedArray {
    public static int removeDuplicates(int[] arr){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,1,6,8};
        int ans = removeDuplicates(arr);
        for(int i=0;i<ans;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
