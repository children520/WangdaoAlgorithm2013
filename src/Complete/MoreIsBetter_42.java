package Complete;

public class MoreIsBetter_42 {
    static int[] tree=new int[20];
    static int[] sum=new int[20];
    static int findRoot(int x){
        if(tree[x]==-1){
            return x;
        }else {
            int temp=findRoot(tree[x]);
            tree[x]=temp;
            return temp;
        }
    }

    public static void main(String[] args) {
        int[][] relationList={
                {1,2},
                {3,4},
                {5,6},
                {1,6}
        };
        for(int i=0;i<tree.length;i++){
            tree[i]=-1;
            sum[i]=1;
        }
        for (int i=0;i<relationList.length;i++){
            int friend1=findRoot(relationList[i][0]);
            int friend2=findRoot(relationList[i][1]);
            System.out.print(friend1+" ");
            System.out.print(friend2+" :");
            if(friend1!=friend2){
                tree[friend1]=friend2;
                //子树的根节点保存的
                sum[friend2]+=sum[friend1];
            }
        }
        System.out.println();
        for(int i=0;i<tree.length;i++){
            System.out.print(tree[i]+" ");
        }
        System.out.println();
        for(int i=0;i<tree.length;i++){

            System.out.print(sum[i]+" ");
        }

    }

}
