// reversing the string using string builder

package D9_9_24;

public class p1 {
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder("super");
        
        for(int i=0;i<s.length()/2;i++){
            int start =i;
            int end = s.length()-i-1;

            char startchar=s.charAt(start);
            char endchar=s.charAt(end);

            s.setCharAt(start, endchar);
            s.setCharAt(end, startchar);
        }
        System.out.println(s);
    
    }
    
}
