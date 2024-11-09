package datastructures.stackandqueue;

import java.util.Stack;

public class _04_MinStack {
    Stack<Pair> stack;

    public _04_MinStack(){
        stack = new Stack<>();
    }

    public void push(int val){
        int min;
        if(stack.isEmpty()){
            min = val;
        }else{
            min  = Math.min(stack.peek().y,val);
        }
        stack.push(new Pair(val,min));
        System.out.println("Push successful - "+val);
    }

    public Pair pop(){
        return stack.pop();
    }

    public Pair top(){
        return stack.peek();
    }

    public int minStack(){
        return stack.peek().y;
    }


    public static void main(String[] args) {
        _04_MinStack minStack = new _04_MinStack();
        minStack.push(5);
        minStack.push(7);
        int min = minStack.minStack();
        System.out.println(min);
        minStack.push(-2);

        min = minStack.minStack();
        System.out.println(min);
    }

}
