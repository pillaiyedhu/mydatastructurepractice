package datastructures.arrays;

public class _10_MaxConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] arr){
        int count = 0;
        int maxCount = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
            }else if(arr[i]!=0){
                maxCount = count;
                count = 0;
            }
        }
        if(maxCount<count){
            maxCount = count;
        }
        return maxCount;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,4,5,0,0,1};

        int ans = findMaxConsecutiveOnes(arr);
        System.out.println(ans);
    }
}
