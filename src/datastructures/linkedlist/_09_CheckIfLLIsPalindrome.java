package datastructures.linkedlist;

public class _09_CheckIfLLIsPalindrome {

    public static _01_Node reverseLinkedList(_01_Node head){
        if(head==null || head.next==null){
            return head;
        }

        _01_Node newHead = reverseLinkedList(head.next);
        _01_Node front = head.next;
        front.next = head;
        head.next = null;

        return newHead;
    }

    public static boolean checkPalindrome(_01_Node head){
        if(head==null || head.next == null){
            return true;
        }

        _01_Node slow = head;
        _01_Node fast = head;

        while(fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }

        _01_Node newHead = reverseLinkedList(slow.next);
        _01_Node first = head;
        _01_Node second = newHead;

        while(second!=null){
            if(first.data!=second.data){
                reverseLinkedList(newHead);
                return false;
            }
            second = second.next;
            first = first.next;
        }
        reverseLinkedList(newHead);
        return true;
    }

    public static void main(String[] args) {
        _01_Node node1 = new _01_Node(13);
        node1.next = new _01_Node(15);
        node1.next.next = new _01_Node(18);
        node1.next.next.next = new _01_Node(15);
        node1.next.next.next.next = new _01_Node(13);

        boolean ans = checkPalindrome(node1);
        System.out.println(ans);
    }
}
