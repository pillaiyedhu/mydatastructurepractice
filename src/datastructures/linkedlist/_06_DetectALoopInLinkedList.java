package datastructures.linkedlist;

//the brute force approach is to maintain a map data structure and
// traverse the LL and keep a track of LL is any node repeating

public class _06_DetectALoopInLinkedList {

    public static boolean detectALoopInLinkedList(_01_Node head){
        _01_Node slow = head;
        _01_Node fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        _01_Node node1 = new _01_Node(13);
        node1.next = new _01_Node(15);
        node1.next.next = new _01_Node(18);
        node1.next.next.next = new _01_Node(11);
        node1.next.next.next.next = new _01_Node(12);

        boolean ans = detectALoopInLinkedList(node1);
        System.out.println(ans);
    }

}
