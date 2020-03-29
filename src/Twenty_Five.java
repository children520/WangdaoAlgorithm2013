public class Twenty_Five {
    static int n=4,m=2;
    static int[][] sideList={{1,3},{4,3}};
    static int[] parents=new int[5];
    public static void main(String[] args) {
        for(int i=0;i<parents.length;i++){
            parents[i]=-1;
        }
        for (int i=0;i<sideList.length;i++){
            int n1=findRoot(sideList[i][0]);
            int n2=findRoot(sideList[i][1]);
            if(n1!=n2){
                parents[n1]=n2;
            }
        }
        int count=0;
        for (int i=1;i<=n;i++){
            if(parents[i]==-1){
                count++;
            }
        }
        System.out.print(count-1);
    }
    static int findRoot(int x){
        if(parents[x]==-1){
            return x;
        }else{
            return findRoot(parents[x]);
        }
    }

}
