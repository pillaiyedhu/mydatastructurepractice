package datastructures.arrays;


//other approach is by sorting
public class _01_LargestElementInAnArray {

    public static int findTheLargestElement(int[] arr){
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {3,1,2,6,4};
        int ans = findTheLargestElement(arr);
        System.out.println(ans);
    }
}
