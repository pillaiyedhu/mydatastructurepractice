package datastructures.linkedlist;

// brute force is that we will make a map and
// traverse the linked list and check if the map has it or not
// and count everything

//use hare and tortoise
public class _08_FindTheLengthOfLoop {

    public static int findTheLengthOfLoop(_01_Node head){
        _01_Node slow = head;
        _01_Node fast = head;
        int count  = 1;

        while(fast!=null || fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;

            if(slow==fast){
                break;
            }
        }

        if(fast==null || fast.next==null){
            return 0;
        }

        fast = fast.next;
        while(slow!=fast){
            fast = fast.next;
            count++;
        }

        return count;


    }

    public static void main(String[] args) {
        _01_Node node1 = new _01_Node(13);
        node1.next = new _01_Node(15);
        node1.next.next = new _01_Node(18);
        node1.next.next.next = new _01_Node(11);
        node1.next.next.next.next = new _01_Node(12);
        node1.next.next.next.next.next = node1.next.next.next;

        int ans = findTheLengthOfLoop(node1);
        System.out.println(ans);
    }
}
