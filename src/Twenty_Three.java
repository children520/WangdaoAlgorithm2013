public class Twenty_Three {
    public static void main(String[] args) {
        int n=31;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                System.out.print("su");
                break;
            }
        }
    }
}
