package datastructures.arrays;

import java.util.*;

public class _12_LongestSubArrayWithGivenSum {

    public static int longestSubarray(int[] arr, int k){
        int sum =0;
        Map<String,Integer> map = new LinkedHashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            list.clear();
            sum = arr[i];
            list.add(arr[i]);
            for(int j=i+1;j<arr.length;j++){
                if(sum == k){
                    map.put(list.toString(),list.size());
                    break;
                }
                else if(sum > k){
                    break;
                }else{
                    sum = sum + arr[j];
                    list.add(arr[j]);
                }
            }
        }

        int ans = Collections.max(map.values());

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,0,3,5,4,1};
        int k = 9;
        int ans = longestSubarray(arr,k);
        System.out.println(ans);
    }
}
