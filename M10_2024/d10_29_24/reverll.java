package d10_29_24;

public class reverll {
    Node head;

    class Node{
        Node next;
        String data;
        Node(String data){
            this.data=data;
            this.next=null;
        }
    }

    void add(String data){
        Node newNode =new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while (currNode.next!=null) {
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }

    void reveroder(){
        if(head==null){
            System.out.println("Linked list is empty");
            return;
        }
        if(head.next==null){
            System.out.println(head);
            return;
        }
        Node prevNode=head;
        Node currNode=head.next;
        while (currNode!=null) {
            Node nexNode=currNode.next;
            currNode.next=prevNode;
            
            //update
            prevNode=currNode;
            currNode=nexNode;
        }
        head.next=null;
        head=prevNode;
    }

    void printll(){
        if(head==null){
            System.out.println("Linked list is empty");
            return;
        }
        Node currNode=head;
        while (currNode!=null) {
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.println("null");
    }

    Node reversRecrursive(Node head){
        if(head==null || head.next==null){
            return head;
        }

        Node newhead= reversRecrursive(head.next);
        head.next.next=head;
        head.next=null;

        return newhead;
    }
    public static void main(String[] args) {
        reverll list=new reverll();
        list.add("p");
        list.add("q");
        list.add("r");
        list.add("s");
        list.add("t");
        list.printll();
        list.head=list.reversRecrursive(list.head);
        list.printll();
    }
}
