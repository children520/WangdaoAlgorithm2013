import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Thirty_Three {
    static class Node{
        int x;
        int y;
        int z;
        int time;

        public Node(int x, int y, int z, int time) {
            this.x = x;
            this.y = y;
            this.z = z;
            this.time = time;
        }
    }
    static boolean[][][] mark=new boolean[50][50][50];
    static int [][][] infor=new int[50][50][50];
    static Queue<Node> queue=new LinkedList<>();
    static int[][] go={
        {1,0,0}, {-1,0,0},{0,1,0},{0,-1,0},{0,0,1},{0,0,-1}
    };
    static int BFS(int length,int width,int height){
        while (!queue.isEmpty()){
            Node now=queue.poll();
            for(int i=0;i<6;i++){
                int new_x=now.x+go[i][0];
                int new_y=now.y+go[i][1];
                int new_z=now.z+go[i][2];
                if(new_x<0||new_x>=length||new_y<0||new_y>=width||new_z<0||new_z>=height){
                    continue;
                }
                if (infor[new_x][new_y][new_z]==1){
                    continue;
                }
                if(mark[new_x][new_y][new_z]==true){
                    continue;
                }
                Node temp=new Node(new_x,new_y,new_z,now.time+1);
                queue.add(temp);
                mark[new_x][new_y][new_z]=true;
                if(new_x==length-1&&new_y==width-1&&new_z==height-1){
                    return temp.time;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int t=1;
        int[] first={3,3,4,20};
        int[][] initList={
                {0,1,1,1},
                {0,0,1,1},
                {0,1,1,1},
                {1,1,1,1},
                {1,0,0,1},
                {0,1,1,1},
                {0,0,0,0},
                {0,1,1,0},
                {0,1,1,0}
        };
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<first[0];i++){
            for (int j=0;j<first[1];j++){
                for(int k=0;k<first[2];k++){
                    infor[i][j][k]=scanner.nextInt();
                    mark[i][j][k]=false;
                }
            }
        }
        while (!queue.isEmpty()){
            queue.poll();
        }
        mark[0][0][0]=true;
        Node temp=new Node(0,0,0,0);
        queue.add(temp);
        int res=BFS(first[0],first[1],first[2]);
        if(res<=first[3]){
            System.out.println(res);
        }else {
            System.out.println(-1);
        }
    }
}
