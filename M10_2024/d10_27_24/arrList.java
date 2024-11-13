import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class arrList {
    public static void main(String[] args) {
        ArrayList<Integer> lis=new ArrayList<>();
        //to add
        lis.add(0);
        lis.add(1);
        lis.add(2,10);
        lis.add(2);
        lis.add(3);
        System.out.println(lis);

        //to get
        System.out.println(lis.get(2));
        System.out.println(lis.get(1));

        //to set
        lis.set(2,9);
        System.out.println(lis);

        //to remove
        lis.remove(1);
        System.out.println(lis);

        //for size
        System.out.println(lis.size());

        //loop
        for(int i=0;i<lis.size();i++){
            System.out.print(lis.get(i));
        }
        System.out.println();

        //sort
        Collections.sort(lis);
        System.out.println(lis);
    }
}
