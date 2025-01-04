package datastructures.linkedlist;

public class _02_SingleLinkedList {

    public static void traverseLinkedList(_01_Node head){
        _01_Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp= temp.next;
        }
        System.out.println();
    }

    public static _01_Node insertNodeToHead(_01_Node head, int newNodeData){
        _01_Node temp = new _01_Node(newNodeData);
        temp.next = head;
        return temp;
    }

    public static _01_Node insertNodeToTail(_01_Node head, int newNodeData){
        _01_Node temp = head;
        _01_Node newNode = new _01_Node(newNodeData);
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next = newNode;
        return head;
    }

    public static _01_Node insertNodeAtPos(_01_Node head, int pos , int newNodeData){
        if(pos==1){
            insertNodeToHead(head,newNodeData);
        }else{
            int count = 1;
            _01_Node newNode = new _01_Node(newNodeData);
            _01_Node temp = head.next;
            while(temp!=null){
                count++;
                if(count==pos){
                    newNode.next = temp.next;
                    temp.next = newNode;
                    break;
                }
                temp = temp.next;
            }
        }
        return head;
    }

    public static _01_Node deleteNode(_01_Node head, int pos){
        _01_Node temp = head;
        _01_Node prev = null;
        for(int i=0;i<pos;i++){
            prev = temp;
            temp = temp.next;
        }

        prev.next = temp.next;
        return head;
    }

    public static void main(String[] args) {
        _01_Node node1 = new _01_Node(13);
        node1.next = new _01_Node(15);
        node1.next.next = new _01_Node(18);
        node1.next.next.next = new _01_Node(11);

        traverseLinkedList(node1);
        _01_Node node2 = insertNodeToHead(node1,21);
        traverseLinkedList(node2);
        _01_Node node3 = insertNodeToTail(node2, 35);
        traverseLinkedList(node3);
        _01_Node node4 = insertNodeAtPos(node3,3,44);
        traverseLinkedList(node4);
        _01_Node node5 = deleteNode(node4,3);
        traverseLinkedList(node5);
    }

}
