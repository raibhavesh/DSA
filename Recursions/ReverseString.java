public class ReverseString {
    public static void printRev(String str, int idx){
        if (idx ==0){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.println(str.charAt(idx));
        printRev(str, idx-1);
    }

    public static void main(String args[]){
        String str = "abcde";
        printRev(str, str.length()-1);
    }
}
