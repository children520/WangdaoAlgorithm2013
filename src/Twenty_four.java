public class Twenty_four {
    public static void main(String[] args) {
        boolean[] list=new boolean[10002];
        list[0]=false;
        list[1]=false;
        for(int i=2;i<=10001;i++){
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    list[i]=true;
                    break;
                }else {
                    list[i]=false;

                }
            }
            System.out.println(i+":"+list[i]);
        }
        int n=100;
        for (int i=2;i<=n;i++){
            if(list[i]==false&&i%10==1){
                System.out.print(i+" ");
            }
        }
    }
}
