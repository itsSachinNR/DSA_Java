import D9_19_24.rec;

public class LinkedList {
    Node head;
    private int size;
    LinkedList(){
        this.size=0;
    }
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }

    //add at starting
    public  void addFirst(String data) {
        Node newNode=new Node(data);
        if(head == null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    //add at last
    public  void addLast(String data) {
        Node newNode=new Node(data);
        if(head == null){
            head=newNode;
            return;
        }
        Node crrNode=head;
        while (crrNode.next !=null) {
            crrNode=crrNode.next;
        }
        crrNode.next=newNode;
    }


    //to print
    public  void PrintLL() {
        if(head==null){
            System.out.println("list is empty");
            return;
        }

        Node crrNode=head;
        while (crrNode !=null) {
            System.out.print(crrNode.data+"->");
            crrNode=crrNode.next;
        }
        System.out.println("null");
    }

    //to delete at first
    public void deletefirst(){
        if(head==null){
            System.out.println("empty list");
            return;
        }
        size--;
        head=head.next;
    }

    //to delete at last
    public void deletelast(){
        if(head==null){
            System.out.println("empty list");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secNode=head;
        Node lasNode=head.next;
        while (lasNode.next!=null) {
            lasNode=lasNode.next;
            secNode=secNode.next;
        }
        secNode.next=null;
    }


    //to get the size
    public void getSize(){
        System.out.println(size);
    }

    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.addFirst("a");
        list.addFirst("b");
        list.PrintLL();
        list.addLast("p");
        list.addLast("q");
        list.addLast("r");
        list.PrintLL();
        list.deletefirst();
        list.PrintLL();
        list.deletelast();
        list.PrintLL();
        list.getSize();
    }
}
