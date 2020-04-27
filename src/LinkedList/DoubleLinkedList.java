package LinkedList;

/**
 * 双链表
 */
public class DoubleLinkedList {
    static class Node{
        Node pre;
        Node post;
        int val;
    }
    //插入
    Node Insert(Node root,int i,int x){
        Node curNode=root;
        while (i!=0){
            curNode=curNode.post;
            i--;
            
        }
        Node newNode=new Node();
        /*Node preNode=curNode.pre;
        Node postNode=curNode.post;

        newNode.val=x;
        newNode.pre=preNode;
        preNode.post=newNode;
        postNode.pre=newNode;*/

        //简化
        newNode.val=x;
        newNode.post=curNode.post;
        curNode.post.pre=newNode;
        newNode.pre=curNode;
        curNode.post=newNode;
        return root;
    }
    //删除
    Node delete(Node root,int i,int x){
        Node curNode=root;
        while (i!=0){
            curNode=curNode.post;
            i--;
        }
        curNode.pre.post=curNode.post;
        curNode.post.pre=curNode.pre;
        return root;
    }


}
