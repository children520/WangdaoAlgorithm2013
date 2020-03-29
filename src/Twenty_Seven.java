import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Twenty_Seven {
    static int[] Tree=new int[30];
    static int findRoot(int x){
        if(Tree[x]==-1){
            return x;
        }
        else {
            int temp=findRoot(Tree[x]);
            Tree[x]=temp;
            return temp;
        }
    }
    static class Edge implements Comparable<Edge>{
        int start,end;
        int cost;

        @Override
        public int compareTo(Edge o) {
            return this.cost-o.cost;
        }
        public Edge(int start,int end,int cost){
            this.start=start;
            this.end=end;
            this.cost=cost;
        }
    }

    public static void main(String[] args) {
        int n=3;
        int n1=0,n2=3,n3=0;
        int[][] list={{1,2,1},{1,3,2},{2,3,4}};
        ArrayList<Edge> edgeList=new ArrayList<>();

        /*
        Scanner scanner=new Scanner(System.in);
        if(scanner.hasNext()){
            n=scanner.nextInt();
        }
        for(int i=0;i<n*(n-1)/2;i++){
            n1=scanner.nextInt();
            n2=scanner.nextInt();
            n3=scanner.nextInt();
        }
         */

        for(int i=0;i<n*(n-1)/2;i++){
            edgeList.add(new Edge(list[i][0],list[i][1],list[i][2]));
        }
        Collections.sort(edgeList);
        for (Edge edge:edgeList){
            System.out.println(edge.cost);
        }
        for (int i=1;i<=n;i++){
            Tree[i]=-1;
        }
        int res=0;
        for(int i=0;i<n*(n-1)/2;i++){
            int start=findRoot(edgeList.get(i).start);
            int end=findRoot(edgeList.get(i).end);
            if(start!=end){
                Tree[start]=end;
                res+=edgeList.get(i).cost;
            }
        }
        System.out.println(res);
    }
}
