package Complete;





import java.util.ArrayList;
import java.util.Collections;

public class SmoothProjectAgain_43 {
    static int[] tree=new int[20];
    public static void main(String[] args) {
        int[][] list={
                {1,2,1},
                {1,3,2},
                {2,3,4}
        };
        ArrayList<Edge> arrayList=new ArrayList<>();

        for (int i=0;i<list.length;i++){
            Edge newEdge=new Edge(0,0,0);
            newEdge.setStart(list[i][0]);
            newEdge.setEnd(list[i][1]);
            newEdge.setCost(list[i][2]);
            arrayList.add(newEdge);
        }
        Collections.sort(arrayList);
        for (Edge edge:arrayList){
            System.out.println(edge.getCost());
        }
        for (int i=0;i<tree.length;i++){
            tree[i]=-1;

        }
        int cost=0;
        for (Edge edge:arrayList){
            int start=findRoot(edge.getStart());
            int end=findRoot(edge.getEnd());
            System.out.println(start+" "+end);
            if(start!=end){
                tree[start]=end;
                cost+=edge.getCost();
            }
        }
        System.out.println(cost);

    }
    static int findRoot(int x){
        if(tree[x]==-1){
            return x;
        }
        return findRoot(tree[x]);
    }
}
