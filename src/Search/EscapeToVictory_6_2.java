package Search;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 在规定时间t,从（0,0,0）的位置走到（A-1,B-1,C-1)
 * 坐标变换数组
 * 广度优先搜索
 * 初始化立方体信息
 *
 */
public class EscapeToVictory_6_2 {
    static class Point{
        int x,y,z;
        int time;
    }
    //三维标记数组
    static boolean[][][] markedList=new boolean[20][20][20];
    //空间数组
    static int[][][] positionList=new int[20][20][20];
    static Queue<Point> queue=new LinkedList<>();
    static int[][] transformList={
            {0,0,1},
            {0,0,-1},
            {1,0,0},
            {-1,0,0},
            {0,1,0},
            {0,-1,0}
    };

    /**
     *
     * @param a 长
     * @param b 宽
     * @param c 高
     * @return
     */
    static int BFS(int a,int b,int c){

        while (!queue.isEmpty()){
            Point point=queue.poll();
            for (int i=0;i<6;i++){
                int new_x=point.x+transformList[i][0];
                int new_y=point.y+transformList[i][1];
                int new_z=point.z+transformList[i][2];
                if(new_x<0||new_x>=a||new_y<0||new_y>=b||new_z<0||new_z>=c){
                    continue;
                }
                if(positionList[new_x][new_y][new_z]==1){
                    continue;
                }
                if(markedList[new_x][new_y][new_z]){
                    continue;
                }
                Point newPoint=new Point();
                newPoint.x=new_x;
                newPoint.y=new_y;
                newPoint.z=new_z;
                newPoint.time=point.time+1;
                System.out.println(newPoint.time);
                System.out.println(newPoint.x+" "+newPoint.y+" "+newPoint.z);
                queue.add(newPoint);
                markedList[new_x][new_y][new_z]=true;
                if(new_x==a-1&&new_y==b-1&&new_z==c-1){
                    return newPoint.time;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] maceLayoutList={
                0,1,1,1,
                0,0,1,1,
                0,1,1,1,
                1,1,1,1,
                1,0,0,1,
                0,1,1,1,
                0,0,0,0,
                0,1,1,0,
                0,1,1,0
        };
        int a=3;
        int b=3;
        int c=4;
        int time=20;
        for (int i=0;i<a;i++){
            for (int j=0;j<b;j++){
                for (int k=0;k<c;k++){
                    positionList[i][j][k]=maceLayoutList[i*b*c+j*c+k];
                    markedList[i][j][k]=false;
                    System.out.print(positionList[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();

        }
        while (!queue.isEmpty()){
            queue.poll();
        }
        markedList[0][0][0]=true;
        Point firstPoint=new Point();
        firstPoint.time=firstPoint.x=firstPoint.y=firstPoint.z=0;
        queue.add(firstPoint);
        int result=BFS(a,b,c);
        System.out.println(result);
        if(result<time){
            System.out.println(result);
        }else {
            System.out.println("-1");
        }
    }
}
