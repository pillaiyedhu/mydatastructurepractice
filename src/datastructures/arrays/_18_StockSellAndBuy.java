package datastructures.arrays;

public class _18_StockSellAndBuy {

    public static int maxProfit(int[] arr){
        int min = Integer.MAX_VALUE;
        int maxProfit =0;
        for (int i=0;i< arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
            if(maxProfit<(arr[i]-min)){
                maxProfit = arr[i]-min;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        //int[] arr = {7,1,5,3,6,4};
        int[] arr = {7,6,4,3,1};//
        int ans = maxProfit(arr);
        System.out.println(ans);
    }
}
