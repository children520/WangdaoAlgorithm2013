import java.util.Scanner;

/**
 * 现在你操纵一个毁灭者，有 m 个操作，t l r，表示时刻 t，毁灭者对所有编号从 l 到 r 的单位，使用了魔法吸收。
 * 操作按照时间顺序给出，计算毁灭者一共吸收了多少法力。
 *
 * 输入数据的第一行有一个整数 n(1 ≤  n ≤105) — 你的魔法单位的数目。
 *
 * 接下来的 n 行，每行有三个整数 si, mi, ri(0 ≤ si ≤ mi ≤ 105, 0 ≤ ri ≤ 105) 描述一个魔法单位。
 *
 * 接下来一行又一个整数 m(1 ≤ m ≤ 105)， — 操作的数目。
 *
 * 接下来的 m 行，每行描述一个操作 t, l, r(0 ≤ t ≤ 109, 1 ≤ l ≤ r ≤ n)，t 非降
 *
 * 输入：
 * 5
 * 0 10 1
 * 0 12 1
 * 0 20 1
 * 0 12 1
 * 0 10 1
 * 2
 * 5 1 5
 * 19 1 5
 *
 *
 */
public class DestroyerProblem {
    public static void main(String[] args) {
//        System.out.println("请输入魔法单位的数目：");
//        Scanner scanner= new Scanner(System.in);
//        int magicnNumber=scanner.nextInt();
//        System.out.println(magicnNumber);
        int magicnNumber=3;
        //int[][] magicUnitList=new int[magicnNumber][3];
        int[][] magicUnitList={
                {0,10,1},
                {2,12,1},
                {0,20,1},
                {0,12,1},
                {0,10,1}
        };
        int operationNumber=2;
        int[][] operationList={
                {5,2,5},
                {19,1,4}
        };
        int result=0;
        for (int i=0;i<magicnNumber;i++){

        }
        for(int i=0;i<operationList.length;i++){
            for (int k=operationList[i][1];k<=operationList[i][2];k++){
                    int startTime;
                    if(i==0){
                        startTime=magicUnitList[k-1][0];
                    }else {
                        startTime=operationList[i-1][0];
                    }
                    int endtime=operationList[i][0];
                    int beformAmount=0;
                    int replySpeed=magicUnitList[i][2];
                    int maxBlueAmount=magicUnitList[k-1][1];
                    int temp=getCurBlueAmount(startTime,endtime,beformAmount,replySpeed,maxBlueAmount);
                    result+=temp;
            }
        }
        System.out.println(result);
    }
    public static int getRes(){
        return 0;
    }
    public static int getCurBlueAmount(int startTime,int endTime,int beforeAmount,int replySpeed,int maxBlueAmount){
        int curBlueAmount=0;
        curBlueAmount=beforeAmount+replySpeed*(endTime-startTime);
        if (curBlueAmount>maxBlueAmount){
            return maxBlueAmount;
        }
        return curBlueAmount;
    }




}
