package datastructures.arrays;

public class _03_CheckIfAnArrayIsSortedOrNot {

    public static boolean isSorted(int[] arr){
        for(int i=1;i< arr.length;i++) {
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,6,8};
        boolean ans = isSorted(arr);
        System.out.println(ans);
    }
}
