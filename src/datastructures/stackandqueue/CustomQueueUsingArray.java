package datastructures.stackandqueue;

public class CustomQueueUsingArray {

    int size;
    int[] arr;
    int start;
    int end;
    int currentSize;

    public CustomQueueUsingArray(){
        size = 100;
        arr = new int[size];
        start = -1;
        end = -1;
        currentSize = 0;
    }

    public void push(int ele){
        if(start==-1 && end==-1){
            start++;
            end++;
        }else{
            end++;
        }
        arr[end] = ele;
        currentSize++;
        System.out.println(ele+" pushed to index "+end);
    }

    public void pop(){
        if(start==-1 && end==-1){
            System.out.println("No pop operation completed");
        }else{
            start++;
        }
        currentSize--;
    }

    public int getTop(){
        return arr[start];
    }

    public int getSize(){
        return currentSize;
    }




}
