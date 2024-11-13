package d10_23_24;
// string,count,elem,ind,parameters in movelematend
// curr=str.char(ind)
// if(curr!=elem)---sout(cuur)
// count+=1
// recursion
//base case--idx==str.len---sout(count*elem)




public class movElemEnd {
    public static void movElemAtEnd(String str,int count,int ind,char elem) {
        if(ind==str.length()){
            for(int i=0;i<count;i++){
                System.out.print(elem);
            }
            return;
        }
        char curr=str.charAt(ind);
        if(curr!=elem){
            System.out.print(curr);
            movElemAtEnd(str, count, ind+1, elem);
        }else{
            
        movElemAtEnd(str, count+1, ind+1, elem);
        }
    }

    public static void main(String[] args) {
        String str="axbcxxd";
        movElemAtEnd(str, 0, 0, 'x');
    }
}
