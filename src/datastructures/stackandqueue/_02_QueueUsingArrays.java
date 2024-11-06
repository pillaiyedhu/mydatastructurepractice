package datastructures.stackandqueue;

public class _02_QueueUsingArrays {
    public static void main(String[] args) {
        CustomQueueUsingArray customQueueUsingArray = new CustomQueueUsingArray();
        customQueueUsingArray.push(9);
        customQueueUsingArray.push(10);
        customQueueUsingArray.push(3);
        customQueueUsingArray.pop();
        int top = customQueueUsingArray.getTop();
        int size = customQueueUsingArray.getSize();
        System.out.println(top+" - "+size);
        customQueueUsingArray.push(3);
        top = customQueueUsingArray.getTop();
        size = customQueueUsingArray.getSize();
        System.out.println(top+" - "+size);

    }
}
