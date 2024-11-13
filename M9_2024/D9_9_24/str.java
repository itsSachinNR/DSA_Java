package D9_9_24;

import java.util.Scanner;

public class str {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        
        // concatenation
        // String name1= "sachin";
        // String name2= "nr";
        // System.out.println(name1+name2);
        // System.out.println(name1+" "+name2);

        //length
        // String name1= "sachin";
        // System.out.println(name1.length()); 


        //charat
        // for(int i=0;i<name1.length();i++){
        //     System.out.println(name1.charAt(i));
        // }



         //comparing 2 strings
        //   String nam1= "sachin";
        //   String nam2= "sachin";
        //   if(nam1.compareTo(nam2)==0){
        //     System.out.println("strings are equal");
        //   }else{
        //     System.out.println("strings are not equal");
        //   }



        //substring
        String sentence ="i'm sachin nr";
        String name=sentence.substring(4);
        System.out.println(name);
        String name1=sentence.substring(4,9);
        System.out.println(name1);
    }
    
}
