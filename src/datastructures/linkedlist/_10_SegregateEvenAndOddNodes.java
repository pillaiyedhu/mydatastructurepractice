package datastructures.linkedlist;

public class _10_SegregateEvenAndOddNodes {

    public static void traverseLinkedList(_01_Node head){
        _01_Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp= temp.next;
        }
        System.out.println();
    }

    public static _01_Node segregateEvenAndOddNodes(_01_Node head){
        _01_Node evenHead = new _01_Node(-1);
        _01_Node oddHead = new _01_Node(-1);
        _01_Node evenTail = evenHead;
        _01_Node oddTail = oddHead;

        _01_Node temp = head;
        int count =1;
        while(temp!=null){
            if(count%2==0){
                evenTail.next = temp;
                evenTail = evenTail.next;
            }else{
                oddTail.next = temp;
                oddTail = oddTail.next;
            }
            count++;
            temp = temp.next;

        }

        evenTail.next = oddHead.next;


        return evenHead.next;

    }

    public static void main(String[] args) {
        _01_Node node1 = new _01_Node(13);
        node1.next = new _01_Node(15);
        node1.next.next = new _01_Node(12);
        node1.next.next.next = new _01_Node(10);
        node1.next.next.next.next = new _01_Node(19);

        _01_Node ans = segregateEvenAndOddNodes(node1);
        traverseLinkedList(ans);

    }
}
