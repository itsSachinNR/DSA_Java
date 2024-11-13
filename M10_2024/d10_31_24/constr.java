package d10_31_24;

class Student{
    String Name;
    int age;

    public void printS(){
        System.out.println(this.Name);
        System.out.println(this.age);
    }

    //constructer without parameter
    Student(){
        System.out.println("hi ");
    }
}
public class constr {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.Name="Sachin";
        s1.age=19;
        s1.printS();
    }
}
