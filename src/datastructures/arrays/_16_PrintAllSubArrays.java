package datastructures.arrays;

public class _16_PrintAllSubArrays {

    public static void printAllSubArrays(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j< arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,0,1,2,1,1,0};
        printAllSubArrays(arr);
    }
}
