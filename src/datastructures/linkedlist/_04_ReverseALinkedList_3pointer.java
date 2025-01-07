package datastructures.linkedlist;

//brute force approach is to use a stack and traverse the list and add all the data into it
//again travese the list and pop the stack you get the reversed linked list

//approach 2 :use 3 pointers and change the links

public class _04_ReverseALinkedList_3pointer {

    public static void traverseLinkedList(_01_Node head){
        _01_Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp= temp.next;
        }
        System.out.println();
    }

    public static _01_Node reverseLinkedList(_01_Node head) {
        _01_Node temp = head;
        _01_Node prev = null;

        while(temp!=null){
            _01_Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
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
