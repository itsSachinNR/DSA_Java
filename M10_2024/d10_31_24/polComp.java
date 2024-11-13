//polymorphism-compile time polymorphism

package d10_31_24;
class Stu{
    String Name;
    int age;

    public void printInfo(String name){
        System.out.println(name);
    }

    public void printInfo(int age){
        System.out.println(age);
    }

    public void printInfo(String name,int age){
        System.out.println(name+" "+age);
        }
}
public class polComp {
    
    public static void main(String[] args) {
        Stu s1=new Stu();
        s1.Name="Sachin";
        s1.age=19;
        s1.printInfo(s1.age);
        s1.printInfo(s1.Name);
        s1.printInfo(s1.Name,s1.age);
    }
}
