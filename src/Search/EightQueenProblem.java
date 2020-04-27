package Search;

/**
 * 八皇后问题
 */
public class EightQueenProblem {
    static int Row=8;
    static int num=0;
    static int Column=8;
    //n行皇后占用的列号
    static int[] placeList=new int[8];
    //n列标记数组
    static boolean[] markColumn=new boolean[8];
    //上对角线标记数组
    static boolean[] UpDiagonalList=new boolean[15];
    //下对角线标记数组
    static boolean[] DownDiagonalList=new boolean[15];
    static void generate(int n){
        for(int i=0;i<Column;i++){
            if(markColumn[i]&&UpDiagonalList[n-i+7]&&DownDiagonalList[n+i]){
                placeList[n]=i;
                markColumn[i]=false;
                UpDiagonalList[n-i+7]=false;
                DownDiagonalList[n+i]=false;
                if(n<7){
                    generate(n+1);
                }else {
                    print();
                }
                markColumn[i]=true;
                UpDiagonalList[n-i+7]=true;
                DownDiagonalList[n+i]=true;
            }
        }

    }
    static void print(){
        num++;
        int[][] table=new int[8][8];
        for(int i=0;i<placeList.length;i++){
            table[i][placeList[i]]=1;
        }
        System.out.println("第"+num+"个：");
        for(int i=0;i<8;i++){
            for (int j=0;j<8;j++){
                System.out.print(table[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        for (int i=0;i<placeList.length;i++){
            markColumn[i]=true;

        }
        for (int i=0;i<UpDiagonalList.length;i++){
            UpDiagonalList[i]=true;
            DownDiagonalList[i]=true;
        }
        generate(0);
    }
}
