package D9_9_24;

public class strbuil {
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder("sachin");
        System.out.println(s);

        // // char at index
        // System.out.println(s.charAt(0));
        // System.out.println(s.charAt(3));
        // System.out.println(s.charAt(5));


        // // to change char
        // s.setCharAt(4, 'e');
        // s.setCharAt(5, 'e');
        // System.out.println(s);


        // // to insert
        // s.insert(0, 'S');
        // s.insert(7, 'N');
        // System.out.println(s);


        // // to add ch at end
        // s.append("nr");
        // System.out.println(s);



        // to delete the ch
        s.delete(2, 4);
        System.out.println(s);
    }
    
} 
