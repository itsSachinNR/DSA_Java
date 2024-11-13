package d10_22_24;

public class reverseorder {

    public static void reverse(String alpha,int indx) {
        if(indx==0){
            System.out.print(alpha.charAt(indx));
            return;
        }
        System.out.print(alpha.charAt(indx));
        reverse(alpha, indx-1);
    }
    public static void main(String[] args) {
        String alp="abcd";
        reverse(alp, alp.length()-1);

    }
}
