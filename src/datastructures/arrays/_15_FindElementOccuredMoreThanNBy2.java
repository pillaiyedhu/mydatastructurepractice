package datastructures.arrays;

import java.util.Arrays;


//brute force is 2 for loops
//optimal is moores algo

//moores algo - add element in count and once count is 0 add new element
public class _15_FindElementOccuredMoreThanNBy2 {

    public static int findElement(int[] arr){
        int element = -1;
        int count = 0;
        for(int i=0;i< arr.length;i++){
            if(count==0){
                element = arr[i];
                count++;
            }
            else if(element == arr[i]){
                count++;
            } else if(element != arr[i]) {
                count--;
            }
        }
        return element;
    }

    public static void main(String[] args) {
        int[] arr = {1,0,1,2,1,1,0};
        int ans = findElement(arr);
        System.out.println(ans);
    }
}
