package d10_31_24;
import java.util.*;
class Students{
    String Name;
    int age;

    public void printS(){
        System.out.println(this.Name);
        System.out.println(this.age);
    }

    //constructer with parameter
    Students(String Name,int age){ 
    this.Name=Name;
    this.age=age;
    }
}
public class constr2 {
    
    public static void main(String[] args) {
        Students s1=new Students("sachin",19);
        s1.printS();
    }
}
