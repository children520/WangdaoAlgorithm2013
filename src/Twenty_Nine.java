/*
  * Floyd算法
  * for(int k=1;k<=n;k++){
  *     for(int i=1;i<=n;i++){
  *         for(int j=1;i<=n;j++){
  *             if(ans[k-1][i][k]=无穷||ans[k-1][k][j]==无穷){
  *                 ans[k][i][j]=ans[k-1][i][j];
  *                 continue;
  *              }
  *             if(ans[k-1][i][j]==无穷||ans[k-1][i][k]+ans[k-1][k][j]<ans[k-1][i][j]){
  *                   ans[k][i][j]=ans[k-1][i][k]+ans[k-1][k][j];
  *             }else{
  *                 ans[k][i][j]=ans[k-1][i][j];
  *             }
 */
public class Twenty_Nine {
    public static void main(String[] args) {
        int[][] res=new int[101][101];
        int[][] list={{1,2,5},{2,3,5},{3,1,2}};
        int n=3;
        int m=3;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                res[i][j]=-1;
            }
            res[i][i]=0;
        }
        for(int i=0;i<m;i++){
            res[list[i][0]][list[i][1]]=list[i][2];
            res[list[i][1]][list[i][0]]=list[i][2];
        }
        for(int k=0;k<n;k++){
            for(int i=0;i<n;i++){
                for (int j=0;j<n;j++){
                    if(res[i][k]==-1||res[k][j]==-1){
                        continue;
                    }
                    if(res[i][j]==-1||res[i][k]+res[k][j]<res[i][j]){
                        res[i][j]=res[i][k]+res[k][j];
                    }
                }
            }
        }
        System.out.println(res[1][n]);

    }
}
