public class Thirty_Two {
    public static void main(String[] args) {
        int n=120;
        int n1=15,n2=9,n3=1;
        for(int i=0;i<100;i++){
            for(int j=0;j<100-i;j++){
                int k=100-i-j;
                if(n1*i+n2*j+k<n){
                    System.out.print(" "+i+" "+j+" "+k);
                }
            }

        }
    }
}
