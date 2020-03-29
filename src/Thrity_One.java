import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Thrity_One {
    static class Node{
        int data;
        boolean visited;
        List<Node> neighbours;
        Node(int data){
            this.data=data;
            this.neighbours=new ArrayList<>();
        }
        public List<Node> getNeighbours(){
            return  neighbours;
        }
        public void setNeighbours(List<Node> neighbours){
            this.neighbours=neighbours;
        }
        public String toString(){
            return ""+data;
        }
        public void addneighbours(Node neighbourNode){
            this.neighbours.add(neighbourNode);
        }
    }
    Stack<Node> stack;
    public Thrity_One(){
        stack=new Stack<>();
    }
    public void toplogicalSort(Node node){
        List<Node> neighbours=node.getNeighbours();
        for(int i=0;i<neighbours.size();i++){
            Node n=neighbours.get(i);
            if(n!=null&&!n.visited){
                toplogicalSort(n);
                n.visited=true;
            }
        }
        stack.push(node);
    }

    public static void main(String[] args) {
        Thrity_One thrity_one=new Thrity_One();
        Node node40 =new Node(40);
        Node node10 =new Node(10);
        Node node20 =new Node(20);
        Node node30 =new Node(30);
        Node node60 =new Node(60);
        Node node50 =new Node(50);
        Node node70 =new Node(70);

        node40.addneighbours(node10);
        node40.addneighbours(node20);
        node10.addneighbours(node30);
        node20.addneighbours(node10);
        node20.addneighbours(node30);
        node20.addneighbours(node60);
        node20.addneighbours(node50);
        node30.addneighbours(node60);
        node60.addneighbours(node70);
        node50.addneighbours(node70);

        System.out.println("排序结果:");
        thrity_one.toplogicalSort(node10);
        Stack<Node> resultStack=thrity_one.stack;
        while (!resultStack.empty()){
            System.out.print(resultStack.pop()+" ");
        }
    }
}
