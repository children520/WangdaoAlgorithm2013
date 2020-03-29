public class Thirty_Five {
    static int n=6;
    static int[] prime={2,3,5,7,11,13,17,19,23,29,31,37,41};
    static int[] list=new int[22];
    static boolean[] hash=new boolean[22];
    public static void main(String[] args) {
        for (int i=0;i<22;i++){
            hash[i]=false;
        }
        list[1]=1;
        hash[1]=true;
        DFS(1);
        System.out.println();

    }
    static Boolean judgePrime(int num){
        for(int i=0;i<13;i++){
            if(prime[i]==num){
                return true;
            }
        }
        return false;
    }
    static void CheckAnswer(){
        if (judgePrime(list[n]+list[1])==false){
            return;
        }
        for(int i=1;i<=n;i++){
            if (i!=1){
                System.out.print(" ");

            }
        }
        System.out.println();
    }
    static void DFS(int num){
        System.out.println(num);
        if(num>1){
            System.out.println("judge");
            if(!judgePrime(list[num]+list[num-1])){
                System.out.println("judge false");
                return;
            }
        }
        if(num==n){
            System.out.println("check");
            CheckAnswer();
            return;
        }
        for(int i=2;i<=n;i++){
            if(hash[i]==false){
                hash[i]=true;
                list[num+1]=i;
                for (int j=0;j<list.length;j++){
                    System.out.print(list[j]+" ");
                }
                System.out.println();
                System.out.println("dfs");
                DFS(num+1);
                System.out.println(num+"fanhu");
                System.out.println("i"+i);
                hash[i]=false;
            }
        }

    }
}
