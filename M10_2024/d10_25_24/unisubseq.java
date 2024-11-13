package d10_25_24;

import java.util.HashSet;

public class unisubseq {
    public static void uniqSubSequence(String str, int ind,String newstr,HashSet<String> set) {
        if(ind==str.length()){
            if(set.contains(newstr)){
                return;
            }else{
                System.out.println(newstr);
                set.add(newstr);
                return;
            }
            
        }
        char currChar=str.charAt(ind);
        uniqSubSequence(str, ind+1,newstr+currChar,set);
        uniqSubSequence(str, ind+1,newstr,set);
    }

    public static void main(String[] args) {
        String str="aaa";
        HashSet<String> set=new HashSet<>();
        uniqSubSequence(str, 0, "",set);
    }
}
