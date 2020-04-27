package Graph;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 拓扑排序
 * 初始化邻接矩阵
 * 清空队列
 * 寻找入度为0的节点，放入队列
 *
 */
public class LeagalOrNot_5_7 {
    static int member=4;
    static int[][] adjacentMatrix=new int[member][member];
    static Queue<Integer> queue=new LinkedList<>();
    static int[] inDegree=new int[member];
    static boolean[] mark=new boolean[member];
    public static void main(String[] args) {
        int[][] list={
                {3,2},
                {0,1},
                {1,2}
        };
        for (int i=0;i<adjacentMatrix.length;i++){
            mark[i]=false;
            for (int j=0;j<adjacentMatrix.length;j++){
                adjacentMatrix[i][j]=0;
            }
        }
        for (int i=0;i<list.length;i++){
            adjacentMatrix[list[i][0]][list[i][1]]=1;
        }
        while (!queue.isEmpty()){
            queue.poll();
        }
        for (int i=0;i<member;i++){
            int sum=0;
            for (int j=0;j<member;j++){
                System.out.print(adjacentMatrix[i][j]+" ");
                sum+=adjacentMatrix[j][i];
            }
            System.out.println();
            inDegree[i]=sum;
        }
        for (int i=0;i<inDegree.length;i++){
            System.out.println(inDegree[i]);
            if(inDegree[i]==0){
                queue.offer(i);
                mark[i]=true;
            }
        }
        int num=0;
        while (!queue.isEmpty()){
            int cur=queue.poll();
            System.out.println("cur"+cur);
            num++;
            for(int i=0;i<adjacentMatrix[cur].length;i++){
                if(adjacentMatrix[cur][i]==1){
                    adjacentMatrix[cur][i]=0;
                    inDegree[i]--;
                }
                if(inDegree[i]==0&&!mark[i]){
                    queue.offer(i);
                    mark[i]=true;
                }
            }
            for (int i=0;i<member;i++){
                for (int j=0;j<member;j++){
                    System.out.print(adjacentMatrix[i][j]+" ");

                }
                System.out.println();
            }
        }
        if (num==member){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }

    }
}
