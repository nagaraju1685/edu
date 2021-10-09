package linkedlist;


class Node{
    int data;
    Node next;
    Node(int x){
    this.data = x;
    }
}

public class LisnedList {

    private Node root = null;
    private Node last = null;

    public void  add(int x){
        Node n = new Node(x);
        if(root == null){
            root = last = n;
        }else{
            last.next = n;
        }
    }
}
