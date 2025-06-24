//removing the duplicates from the string
public class Duplicates {
    public static boolean[] map =new boolean[26];
    public static void remDupli(String str, int idx, String newstr){
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }
        char currentchar = str.charAt(idx);
        if(map[currentchar-'a']==true){
            remDupli(str, idx+1, newstr);
        }
        else{
            newstr += currentchar;
            map[currentchar-'a']=true;
            remDupli(str, idx+1, newstr);
        }

    }
    public static void main(String[] args) {
        String str ="aavcxxdedac";
        remDupli(str, 0, " ");
        
    }
}

