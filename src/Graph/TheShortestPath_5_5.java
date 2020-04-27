package Graph;

/**
 * 佛洛依德算法
 */
public class TheShortestPath_5_5 {
    public static void main(String[] args) {
        int[][] matrix=new int[4][4];
        int[][] list={
                {1,2,5},
                {2,3,5},
                {3,1,2}
        };
        for (int i=0;i<list.length;i++){
            matrix[list[i][0]][list[i][1]]=list[i][2];
            matrix[list[i][1]][list[i][0]]=list[i][2];
        }
        for (int i=1;i<matrix.length;i++){
            for (int j=1;j<matrix.length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        for (int k=1;k<matrix.length;k++){
            for (int i=1;i<matrix.length;i++){
                for (int j=1;j<matrix.length;j++){
                    if(matrix[i][k]==0||matrix[i][k]==0){
                        continue;
                    }
                    if(((matrix[i][k]+matrix[k][j])<matrix[i][j])||matrix[i][j]==0){
                        matrix[i][j]=matrix[i][k]+matrix[k][j];
                    }
                }
            }
        }
        for (int i=1;i<matrix.length;i++){
            for (int j=1;j<matrix.length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(matrix[1][3]);
    }
}
