package Complete;

import java.util.ArrayList;
import java.util.Collections;

public class Freckles_5_4 {
    static int[] tree=new int[20];
    public static void main(String[] args) {
        float[][] list={
                {1,1},
                {2,2},
                {2,4},
        };
        ArrayList<Edge> arrayList=new ArrayList<>();
        for (int i=1;i<=list.length;i++){
            for (int j=i+1;j<=list.length;j++){
                Edge edge=new Edge(i,j,getDistance(
                        list[i-1][0],list[i-1][1],list[j-1][0],list[j-1][1]));
                arrayList.add(edge);
            }
        }
        Collections.sort(arrayList);
        float cost=0;
        for (int i=0;i<list.length;i++){
            tree[i]=-1;
        }
        for(Edge edge:arrayList){
            int start=findRoot(edge.getStart());
            int end=findRoot(edge.getEnd());
            if(start!=end){
                tree[start]=end;
                cost+=edge.getCost();
            }
        }
        System.out.println(cost);
    }
    static float getDistance(float x1,float y1,float x2,float y2 ){
        return (float)Math.sqrt(Math.pow(x1-x2,2)+Math.pow((y1-y2),2));
    }
    static int findRoot(int x){
        if(tree[x]==-1){
            return x;
        }
        return findRoot(tree[x]);
    }
}
