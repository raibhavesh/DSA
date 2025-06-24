// Moving all x of the str to the end of the str

public class Moveallx {
    public static void moveAllx(String str, int idx, int count, String newstr){
        if(idx==str.length()){
            for(int i=0;i<count;i++){
                newstr+='x';
            }
            System.out.println(newstr);
            return;
        }
        char currchar = str.charAt(idx);
        if(currchar=='x'){
            count++;
            moveAllx(str, idx+1, count, newstr);
        }
        else{
            newstr+=currchar;
            moveAllx(str, idx+1, count, newstr);
        }
    }
    public static void main(String[] args) {
        String str = "axxbxddefx";
        moveAllx(str, 0, 0, " ");
        
    }
}
