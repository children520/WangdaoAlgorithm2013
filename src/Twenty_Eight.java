import java.util.ArrayList;
import java.util.Collections;

public class Twenty_Eight {
    static int[] Tree=new int[101];
    static int findRoot(int x){
        if(Tree[x]==-1){
            return x;
        }else{
            int temp=findRoot(Tree[x]);
            Tree[x]=temp;
            return temp;
        }
    }
    static class Edge implements Comparable<Edge>{
        @Override
        public int compareTo(Edge o) {
            return (int)(this.cost-o.cost);
        }

        int start,end;
        double cost;
        Edge(int start,int end,double cost){
            this.start=start;
            this.end=end;
            this.cost=cost;
        }
    }
    static class Point{
        double x,y;
        double getDistance(Point point){
            double temp=(this.x-point.x)*(this.x-point.x)+(this.y-point.y)*(this.y-point.y);
            return  Math.sqrt(temp);
        }
        Point(double x,double y){
            this.x=x;
            this.y=y;
        }
    }

    public static void main(String[] args) {
        int n=3;
        double[][] List={{1.0,1.0},{2.0,2.0},{2.0,4.0}};
        ArrayList<Point> pointArrayList=new ArrayList<>();
        ArrayList<Edge> edgeArrayList=new ArrayList<>();
        for(int i=0;i<n;i++){
            pointArrayList.add(new Point(List[i][0],List[i][1]));
        }
        int size=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                edgeArrayList.add(new Edge(i,j,pointArrayList.get(i).getDistance(pointArrayList.get(j))));
                size++;
            }
        }
        Collections.sort(edgeArrayList);
        for (int i=0;i<n;i++){
            Tree[i]=-1;
        }
        double res=0;
        for (int i=0;i<size;i++){
            int start=findRoot(edgeArrayList.get(i).start);
            int end=findRoot(edgeArrayList.get(i).end);
            if(start!=end){
                Tree[start]=end;
                res+=edgeArrayList.get(i).cost;
            }
        }
        System.out.println(res);
    }
}
