package datastructures.arrays;


import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

//naive approach - use 2 for loops
//for now best approach - maps
//later learn and use xor

public class _11_FindNumberThatAppearOnceAndOtherThatAppearTwice {

    public static int[] findNumbers(int[] arr){
        int[] ans = new int[2];
        Map<Integer,Integer> map = new LinkedHashMap<>();
        for(int i=0;i< arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        map.entrySet().stream().forEach(e -> {
            if(e.getValue() == 1){
                ans[0] = e.getKey();
                return;
            }
        });
        map.entrySet().stream().forEach(e -> {
            if(e.getValue() == 2){
                ans[1] = e.getKey();
                return;
            }
        });

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,4,4,0,1,6};

        int[] ans = findNumbers(arr);
        System.out.println(Arrays.toString(ans));
    }
}
