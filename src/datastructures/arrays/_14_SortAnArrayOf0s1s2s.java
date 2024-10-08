package datastructures.arrays;

import java.util.Arrays;


//brute approach is any sorting method
//best approach is 3 pointer
public class _14_SortAnArrayOf0s1s2s {

    public static void sort(int[] arr){
        int low = 0;
        int mid = 0;
        int end = arr.length-1;
        while(mid<end){
            if(arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                mid++;
                low++;
            }
            else if(arr[mid]==2){
                int temp = arr[mid];
                arr[mid] = arr[end];
                arr[end] = temp;
                end--;
            }else{
                mid++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,0,2,2,1,1,0};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
