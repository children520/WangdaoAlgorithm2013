import java.util.ArrayList;

public class Thirty {
    static class Node{
        int next;

        public int getNext() {
            return next;
        }

        public void setNext(int next) {
            this.next = next;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        int value;
        Node(int next,int value){
            this.next=next;
            this.value=value;
        }
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Node>> nodeList=new ArrayList<>(101);
        boolean mark[]=new boolean[101];
        int[] distance=new int[101];
        int[][] list={{1,2,5},{2,3,5},{3,1,2}};
        int n=3;
        int m=3;
        for(int i=0;i<m;i++){
            Node node=new Node(list[i][1],list[i][2]);
            nodeList.get(list[i][0]).add(node);
            node.setNext(list[i][0]);
            nodeList.get(list[i][1]).add(node);
        }
        for(int i=1;i<=n;i++){
            distance[i]=-1;
            mark[i]=false;
        }
        distance[1]=0;
        mark[1]=true;
        int newNode=1;
       // for(int i=1;)


    }
}
