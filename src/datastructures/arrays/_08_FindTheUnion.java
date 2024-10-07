package datastructures.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//we can use set to remove duplicates
//using map
//if the arrays are sorted we can use two pointers and make use of single for loop and add 1 by 1
//but here too we need to use a extra ds to store data instead use set
public class _08_FindTheUnion {
    public static Set findTheUnion(int[] arr1, int[] arr2){
        Set<Integer> set = new HashSet<>();
        int i=0;
        int j=0;
        while(i<arr1.length || j<arr2.length){
            if(arr1.length!=i){
                set.add(arr1[i]);
                i++;
            }
            if(arr2.length!=j){
                set.add(arr2[j]);
                j++;
            }
        }
        return set;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,0,4,5,0,7};
        int[] arr2 = {1,2,4,5,7};

        Set<Integer> set = findTheUnion(arr,arr2);
        System.out.println(set);
    }
}
