package D9_16_24;

public class clear {
    public static void main(String[] args) {
        int n=5;
        int pos=2;
        int bitmask=1<<pos;

        System.out.println(~(bitmask)&n);
    }
}
