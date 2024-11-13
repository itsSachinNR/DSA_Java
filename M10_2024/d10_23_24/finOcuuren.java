package d10_23_24;

public class finOcuuren {

    public static int first=-1;
    public static int last=-1;

    public static void findOcuurence(char element, int ind , String str) {
        if(ind==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }

        char curr=str.charAt(ind);
        if(curr==element){
            if(first==-1){
                first=ind;
            }else{
                last=ind;
            }
        }
        findOcuurence(element, ind+1, str);
    }

    public static void main(String[] args) {
        String str="abaacdaefaah";
        findOcuurence('a', 0, str);
    }
}
