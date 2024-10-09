package datastructures.arrays;

//brute force use 2 for loops
//optimal - start from end of the array and add the max elements to an list they are the leaders

//leader means - 11,22,2,4,3, ->11 is not leader as 22 is greater than 11,
//22 is leader as all elements are smaller,
//2 is not , 4 is a leader and last element is always the leader.

import java.util.ArrayList;
import java.util.List;

public class _22_FindTheLeader {

    public static List<Integer> findLeaders(int[] arr){
        List<Integer> ans = new ArrayList<>();
        int leader = -1;
        for(int i= arr.length-1;i>=0;i--){
            if(arr[i]>leader){
                leader=arr[i];
                ans.add(leader);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {11,22,2,4,3};
        List<Integer> ans = findLeaders(arr);
        System.out.println(ans);
    }
}
