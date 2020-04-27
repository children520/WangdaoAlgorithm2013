package Graph;

/**
 * 迪杰斯特拉算法
 * 单点最短路径问题
 */

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 初始化邻接链表
 * 初始化数组
 * 遍历邻接数组，更新其距离
 * 选择最小值
 *
 */
public class TheShortestPath_5_6 {
    public static void main(String[] args) {
        int dotNumber=3;
        int[][] list={
                {1,2,5},
                {2,3,4}
        };
        Node[] nodeArray=new Node[100];
        int start=1;
        int end=3;
        boolean[] mark=new boolean[100];
        int[] distance=new int[100];
        ArrayList<ArrayList> arrayList=new ArrayList<>(dotNumber+1);
        for (int i=1;i<=list.length;i++){
            Node node=new Node();
            //node.own=list[i-1][0];
            //node.next=list[i-1][1];
            //node.cost=list[i-1][2];
            arrayList.get(list[i-1][0]).add(node);
            arrayList.get(list[i-1][1]).add(node);
        }

        for (int i=0;i<mark.length;i++){
            mark[i]=false;
            distance[i]=-1;
        }
        mark[start]=true;
        distance[start]=0;
        for (int i=1;i<arrayList.size();i++){
            for (int j=1;j<arrayList.get(i).size();j++){
                System.out.print(arrayList.get(i).get(j));
            }
        }

    }
}
class Node{
    int name;
    Node next;
}
class Graph{


}