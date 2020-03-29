import java.util.Scanner;

public class Thirty_Seven {

    static void DFS(int x,int y,int old_time){
        for (int i=0;i<4;i++){
            int new_x=x+go[i][0];
            int new_y=y+go[i][1];
            if(new_x<1||new_x>length||new_y<1||new_y>width){
                continue;
            }
            if(mapInfor[new_x][new_y]=='X'){
                continue;
            }
            if(mapInfor[new_x][new_y]=='D'){
                if(old_time+1==time){
                    successs=true;
                    return;
                }
                continue;
            }
            mapInfor[new_x][new_y]='X';
            DFS(new_x,new_y,old_time+1);
            mapInfor[new_x][new_y]='-';
            if(successs){
                return;
            }
        }
    }
    static char[][] mapInfor=new char[8][8];
    static int length,width,time;
    static boolean successs;
    static int go[][]={{1,0},{-1,0},{0,1},{0,-1}};
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        for(int i=1;i<length;i++){
            for(int j=1;i<width;j++){
                mapInfor[i][j]=scanner.next().charAt(0);
            }
        }
        successs=false;
        int end_x=0,end_y=0;
        for(int i=1;i<=length;i++){
            for(int j=1;j<=width;j++){
                if(mapInfor[i][j]=='D'){
                    end_x=i;
                    end_y=j;
                }
            }
        }
        for(int i=1;i<=length;i++){
            for(int j=1;j<=width;j++){
                if(mapInfor[i][j]=='S'&&(i+j)%2==((end_x+end_y)%2+time%2)%2){
                    mapInfor[i][j]='X';
                    DFS(i,j,0);
                }
            }
        }
        System.out.println(successs==true?"yes":"no");
    }
}
