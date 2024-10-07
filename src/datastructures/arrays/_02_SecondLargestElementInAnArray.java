package datastructures.arrays;

public class _02_SecondLargestElementInAnArray {
    public static int findTheSecondLargestElement(int[] arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) {
                secondMax = max;
                max = arr[i];
            }else if(arr[i]>secondMax){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        int[] arr = {3,1,2,6,4};
        int ans = findTheSecondLargestElement(arr);
        System.out.println(ans);
    }
}
