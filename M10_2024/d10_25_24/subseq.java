package d10_25_24;

public class subseq {
    public static void subSequence(String str, int ind,String newstr) {
        if(ind==str.length()){
            System.out.println(newstr);
            return;
        }
        char currChar=str.charAt(ind);
        subSequence(str, ind+1,newstr+currChar);
        subSequence(str, ind+1,newstr);
    }

    public static void main(String[] args) {
        String str="abc";
        subSequence(str, 0, "");
    }
}
