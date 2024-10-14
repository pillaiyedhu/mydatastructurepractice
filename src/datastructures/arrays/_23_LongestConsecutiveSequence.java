package datastructures.arrays;

import java.util.HashSet;
import java.util.Set;

//brute force - for every element do a linear search to find element+1 is present or not
//optimal approach - sort and find the ans
//best approach - using set dataStructure
public class _23_LongestConsecutiveSequence {

    public static void findLongestConsecutiveSequence(int[] arr){
        Set<Integer> set = new HashSet<>();
        int longest = 1;
        for(int val : arr){
            set.add(val);
        }
        for(int val : set){
            if(!set.contains(val-1)){
                int count = 1;
                int x = val;
                while(set.contains(x+1)){
                    count++;
                    x++;
                }
                longest = Math.max(count,longest);
            }
        }
        System.out.println(longest);
    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,5,2,33,31,32};
        findLongestConsecutiveSequence(arr);
    }
}
