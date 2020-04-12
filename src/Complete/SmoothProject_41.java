package Complete;

public class SmoothProject_41 {
    static int townNumber=5;
    static int roadNumber=3;
    static int[] tree=new int[townNumber+1];
    public static void main(String[] args) {
        for (int i=0;i<tree.length;i++){
            tree[i]=-1;
        }
        int[][] roadList={
                {1,2},
                {3,5},
        };
        for(int i=0;i<roadList.length;i++){
            if(tree[roadList[i][0]]!=-1){
                tree[roadList[i][1]]=roadList[i][0];
            }else {
                tree[roadList[i][0]]=roadList[i][1];
            }
        }
        int count=-1;
        for (int i=1;i<tree.length;i++){
            System.out.println(tree[i]);
            if(tree[i]==-1){
                count++;
            }
        }
        System.out.println(count);
    }
    static int findRoot(int val){
        if(val==-1){
            return val;
        }
        return findRoot(tree[val]);
    }
}
