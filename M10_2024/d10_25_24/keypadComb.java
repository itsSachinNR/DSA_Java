package d10_25_24;

public class keypadComb {
    public static String[] keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void KeypadCombination(String str, String combination,int ind) {
        if(ind==str.length()){
            System.out.println(combination);
            return;
        }

        char currChar=str.charAt(ind);
        String mapping=keypad[currChar-'0'];

        for(int i=0;i<mapping.length();i++){
            KeypadCombination(str, combination+mapping.charAt(i), ind+1);
        }
        
    }

    public static void main(String[] args) {
        String str="23";
        KeypadCombination(str, "", 0);
    }
}
