package datastructures.linkedlist;

public class _03_MiddleOfLinkedList {

    public static _01_Node findMiddle(_01_Node head){
        _01_Node slow = head;
        _01_Node fast = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }



    public static void main(String[] args) {
        _01_Node node1 = new _01_Node(13);
        node1.next = new _01_Node(15);
        node1.next.next = new _01_Node(18);
        node1.next.next.next = new _01_Node(11);
        node1.next.next.next.next = new _01_Node(13);

        _01_Node middleNode = findMiddle(node1);
        System.out.println(middleNode.data);
    }
}
