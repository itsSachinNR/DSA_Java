package d10_25_24;

public class remDupli {

    public static boolean map[]=new boolean[26];

    public static void removeDuplicates(int ind, String str,String newstr) {
        if(ind==str.length()){
            System.out.println(newstr);
            return;
        }
        char currChar=str.charAt(ind);
        if(map[currChar-'a']){
            removeDuplicates(ind+1, str, newstr);
        }else{
            newstr+=currChar;
            map[currChar-'a']= true;
            removeDuplicates(ind+1, str, newstr);
        }
        
    }
    public static void main(String[] args) {
        String str="abbcazcda";
        removeDuplicates(0, str, "");
    }
}
