package datastructures.stackandqueue;

public class CustomStackUsingArray {
    int size = 1000;
    int[] arr = new int[size];
    int top = -1;

    void push(int val){
        top++;
        arr[top]=val;
        System.out.println(val+"pushed to index"+top);
    }

    int top(){
        return top;
    }

    int pop(){
        int ele = arr[top];
        top--;
        return ele;
    }

    int size(){
        return top+1;
    }



}
