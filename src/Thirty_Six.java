import java.util.Scanner;

public class Thirty_Six {
    static char[][] mapInfor=new char[101][101];
    static boolean[][] mark=new boolean[101][101];
    static int length,width;
    static int go[][]={{1,0},{-1,0},{0,1},{0,-1},{1,1},{1,-1},{-1,-1},{-1,1}};
    static void DFS(int x,int y){
        for (int i=0;i<8;i++){
            int new_x=x+go[i][0];
            int new_y=y=go[i][1];
            if(new_x<1||new_x>width||new_y<1||new_y>length){
                continue;
            }
            if(mapInfor[new_x][new_y]=='*'){
                continue;
            }
            if(mark[new_x][new_y]==true){
                continue;
            }
            mark[new_x][new_y]=true;
            DFS(new_x,new_y);
        }
    }

    public static void main(String[] args) {
        int width=3;//m
        int length=5;//n
        Scanner scanner=new Scanner(System.in);
        for(int i=1;i<=length;i++){
            for(int j=1;j<=width;j++){
                mapInfor[length][width]=scanner.next().charAt(0);
                mark[i][j]=false;
            }
        }
        int count=0;
        for(int i=1;i<=length;i++){
            for (int j=1;j<=width;j++){
                if(mark[i][j]==true){
                    continue;
                }
                if(mapInfor[i][j]=='*'){
                    continue;
                }
                DFS(i,j);
                count++;
            }
        }
        System.out.println(count);

    }
}
