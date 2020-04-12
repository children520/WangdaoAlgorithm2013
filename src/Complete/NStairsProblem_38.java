package Complete;

public class NStairsProblem_38 {
    public static void main(String[] args) {
        int n=4;
        System.out.println(rec(n));
    }
    public static int rec(int n){
        if(n==1){
            return 1;
        }else if(n==2){
            return 2;
        }
        return rec(n-1)+rec(n-2);
    }
}
