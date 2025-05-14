public class Toh{
    public static void towerhanoi(int n, String src, String helper, String dest){
        if(n==1){
            System.out.println("Transfer disk " + n + "from" +src + " to " + dest);
            return ;
        }
        towerhanoi(n-1, src, dest, helper);
        System.out.println("Transfer disk " + n + "from" +src + " to " + dest);
        towerhanoi(n-1, helper, src, dest);
    }
    public static void main(String args[]){
        int n =3;
        towerhanoi(n, "S", "H", "D");
    }
}
