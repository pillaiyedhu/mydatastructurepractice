package datastructures.linkedlist;

public class _07_FindTheStartingPointOfLoop {

    public static _01_Node findStartingOfLoop(_01_Node head){
        _01_Node slow = head;
        _01_Node fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                break;
            }
        }
        if(fast==null || fast.next==null){
            return head;
        }

        slow = head;
        while (slow!=fast){
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }

    public static void main(String[] args) {
        _01_Node node1 = new _01_Node(13);
        node1.next = new _01_Node(15);
        node1.next.next = new _01_Node(18);
        node1.next.next.next = new _01_Node(11);
        node1.next.next.next.next = new _01_Node(12);
        node1.next.next.next.next.next = node1.next.next.next;

        _01_Node ans = findStartingOfLoop(node1);
        System.out.println(ans.data);
    }
}
