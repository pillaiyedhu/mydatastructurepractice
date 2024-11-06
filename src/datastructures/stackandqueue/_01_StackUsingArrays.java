package datastructures.stackandqueue;

public class _01_StackUsingArrays {
    public static void main(String[] args) {
        CustomStackUsingArray customStackUsingArray = new CustomStackUsingArray();
        customStackUsingArray.push(5);
        customStackUsingArray.push(6);
        customStackUsingArray.push(1);
        customStackUsingArray.push(3);
        System.out.println(customStackUsingArray.top());
        System.out.println(customStackUsingArray.size());
        System.out.println(customStackUsingArray.pop());
        System.out.println(customStackUsingArray.top());
        System.out.println(customStackUsingArray.size());

    }
}
