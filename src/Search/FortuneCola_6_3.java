package Search;

import java.util.LinkedList;
import java.util.Queue;

/**
 * n,m,s体积的杯子，s=n+m,s升的可乐，n,m如何获得s/2的可乐
 */
public class FortuneCola_6_3 {
    static class State{
        int grossCapacity;
        int firstCapacity;
        int secondCapacity;
        int count;
    }
    static int grossCapacity=7;
    static int firstCapacity=4;
    static int secondCapacity=3;
    static int[][] stateTransformList={
            {-firstCapacity,firstCapacity,0},
            {-secondCapacity,secondCapacity,0},
            {-firstCapacity,0,firstCapacity},
            {-secondCapacity,0,secondCapacity},
            {0,firstCapacity,-firstCapacity},
            {0,-firstCapacity,firstCapacity},
            {0,secondCapacity,-secondCapacity},
            {0,-secondCapacity,secondCapacity}
    };
    static boolean[][][] stateList=new boolean[9][9][9];
    static Queue<State> queue=new LinkedList<>();
    static int BFS(int grossCapacity){
        while (!queue.isEmpty()){
            State state=queue.poll();
            for (int i=0;i<stateTransformList.length;i++){
                int newGrossCapacity=state.grossCapacity+stateTransformList[i][0];
                int newFirstCapacity=state.firstCapacity+stateTransformList[i][1];
                int newSecondCapacity=state.secondCapacity+stateTransformList[i][2];
                System.out.println(newGrossCapacity+" "+newFirstCapacity+" "+newSecondCapacity);
                if(newGrossCapacity<0||newGrossCapacity>grossCapacity
                        ||newFirstCapacity<0||
                            newSecondCapacity<0){
                    continue;
                }
                if(newGrossCapacity==0&&newFirstCapacity==newSecondCapacity){
                    return 1;
                }
                System.out.println(stateList[newGrossCapacity][newFirstCapacity][newSecondCapacity]);
                if(stateList[newGrossCapacity][newFirstCapacity][newSecondCapacity]){
                    continue;
                }
                State newState=new State();
                newState.grossCapacity=newGrossCapacity;
                newState.firstCapacity=newFirstCapacity;
                newState.secondCapacity=newSecondCapacity;
                newState.count=state.count+1;
                queue.add(newState);
                stateList[newGrossCapacity][newFirstCapacity][newSecondCapacity]=true;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        State state=new State();
        state.grossCapacity=grossCapacity;
        state.secondCapacity=0;
        state.firstCapacity=0;
        state.count=0;
        stateList[0][0][0]=true;
        queue.add(state);

        System.out.println(BFS(grossCapacity));
    }
}
