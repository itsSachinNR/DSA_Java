package D9_13_24;

public class getbit {
    public static void main(String[] args) {
        int n=5;
        int pos=3;
        int bitmask=1<<pos;
        if((bitmask&n)==0){
            System.out.println("bit was zero");
        }else{
            System.out.println("bit was one");
        }
    }
}