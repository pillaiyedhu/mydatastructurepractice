package datastructures.linkedlist;

public class _05_ReverseALinkedList_Recursion {

    public static void traverseLinkedList(_01_Node head){
        _01_Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp= temp.next;
        }
        System.out.println();
    }

    public static _01_Node reverseLinkedList(_01_Node head){
        if(head == null || head.next == null){
            return head;
        }

        _01_Node newNode = reverseLinkedList(head.next);
        _01_Node front = head.next;
        front.next=head;
        head.next = null;

        return newNode;
    }

    public static void main(String[] args) {
        _01_Node node1 = new _01_Node(13);
        node1.next = new _01_Node(15);
        node1.next.next = new _01_Node(18);
        node1.next.next.next = new _01_Node(11);
        node1.next.next.next.next = new _01_Node(12);

        traverseLinkedList(node1);
        _01_Node reverseHead = reverseLinkedList(node1);
        traverseLinkedList(reverseHead);
    }
}
