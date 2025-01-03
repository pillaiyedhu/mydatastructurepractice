package datastructures.linkedlist;

public class SingleLinkedList {

    public static void traverseLinkedList(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp= temp.next;
        }
        System.out.println();
    }

    public static Node insertNodeToHead(Node head, int newNodeData){
        Node temp = new Node(newNodeData);
        temp.next = head;
        return temp;
    }

    public static Node insertNodeToTail(Node head, int newNodeData){
        Node temp = head;
        Node newNode = new Node(newNodeData);
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next = newNode;
        return head;
    }

    public static Node insertNodeAtPos(Node head, int pos , int newNodeData){
        if(pos==1){
            insertNodeToHead(head,newNodeData);
        }else{
            int count = 1;
            Node newNode = new Node(newNodeData);
            Node temp = head.next;
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

    public static Node deleteNode(Node head,int pos){
        Node temp = head;
        Node prev = null;
        for(int i=0;i<pos;i++){
            prev = temp;
            temp = temp.next;
        }

        prev.next = temp.next;
        return head;
    }

    public static void main(String[] args) {
        Node node1 = new Node(13);
        node1.next = new Node(15);
        node1.next.next = new Node(18);
        node1.next.next.next = new Node(11);

        traverseLinkedList(node1);
        Node node2 = insertNodeToHead(node1,21);
        traverseLinkedList(node2);
        Node node3 = insertNodeToTail(node2, 35);
        traverseLinkedList(node3);
        Node node4 = insertNodeAtPos(node3,3,44);
        traverseLinkedList(node4);
        Node node5 = deleteNode(node4,3);
        traverseLinkedList(node5);
    }

}
