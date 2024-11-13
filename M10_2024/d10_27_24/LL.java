import java.util.LinkedList;

class LL {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<String>();

        list.addFirst("a");
        list.addFirst("b");
        list.addFirst("c");
        System.out.println(list);
        list.addLast("p");
        list.addLast("q");
        list.addLast("r");
        System.out.println(list);
        System.out.println(list.size());

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+"->");
        }
        System.out.println("null");


        list.remove(2);
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
    }
}
