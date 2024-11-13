package d10_31_24;

class Pen{
    String color;
    String type;

    public void writing(){
        System.out.println("Writing");
    }

    public void printCT(){
        System.out.println(this.color);
        System.out.println(this.type);
    }
}
public class oops {
    public static void main(String[] args) {
        Pen pen1=new Pen();
        pen1.color="blue";
        pen1.type="ballpen";

        Pen pen2 =new Pen();
        pen2.color="red";
        pen2.type="gelpen";

        pen1.printCT();
        pen2.printCT();
    }
    
}
