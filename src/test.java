import java.util.*;

public class test {
    public static void main(String[] args) {
        float f=3.2f;
        System.out.println(f);
    }

    public static int gcd(int a,int b){
        if(b==0) return a;
        else return gcd(b,a%b);
    }
}
class MedianFinder {
    Node startNode;
    class Node{
        int val;
        Node next;

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
    /** initialize your data structure here. */
    public MedianFinder() {
        startNode=new Node(0,null);
    }

    public void addNum(int num) {
        Node endNode=new Node(0,null);
        Node newNode=new Node(num,null);
        if(startNode.next==null){
            startNode.next=newNode;
        }
        endNode.next=newNode;
        endNode=newNode;

    }

    public double findMedian() {
        int count=0;
        while (startNode.next!=null){
            count++;
        }
        if(count%2==0){
            
        }
        return count;
    }
}


