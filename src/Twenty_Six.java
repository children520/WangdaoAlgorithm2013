public class Twenty_Six {
    static int[][] sideList={{1,2},{3,4},{5,6},{1,6}};
    static int[] parents=new int[10];
    static int[] countList=new int[10];
    public static void main(String[] args) {
        int m=4;
        for (int i=0;i<parents.length;i++){
            parents[i]=-1;
            countList[i]=1;
        }
        for(int i=0;i<sideList.length;i++){
            int n1=findRoot(sideList[i][0]);
            int n2=findRoot(sideList[i][1]);
            if(n1!=n2){
                parents[n1]=n2;
                countList[n2]+=countList[n1];
            }
        }
        int max=1;
        for(int i=1;i<parents.length;i++){
            System.out.print(countList[i]);
            if(countList[i]>max&&parents[i]==-1){
                max=countList[i];

            }
        }
        System.out.println();
        System.out.println(max);

    }
    static int findRoot(int x){
        if(parents[x]==-1){
            return x;
        }
        return findRoot(parents[x]);
    }
}
