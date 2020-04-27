package LinkedList;

import java.util.ArrayList;

/**
 * 单链表的实现
 */
public class SingleLinkedList {
    static class Node{
        int val;
        Node next;
    }
    //头插法
    Node headInsert(Node root,int x){
        Node newNode=new Node();
        newNode.val=x;
        newNode.next=root.next;
        root.next=newNode;
        return root;
    }
    //尾插法
    Node tailInsert(Node root,int x){
        Node newNode=new Node();
        newNode.val=x;
        Node endNode=new Node();
        while (root.next!=null){
            endNode=root.next;
            root=root.next;
        }
        endNode.next=newNode;
        endNode=newNode;
        return root;
    }
    //在i个位置前插入某个节点
    Node headInsertNode(Node root,int i,int x){
        Node prenode=root;
        while (i!=1){
            prenode=prenode.next;
            i--;
        }
        Node newNode=new Node();
        newNode.val=x;
        newNode.next=prenode.next;
        prenode.next=newNode;
        return root;
    }
    //在i个位置后插入某个节点
    Node tailInsertNode(Node root,int i,int x){
        Node node=root;
        while (i!=0){
            node=node.next;
            i--;
        }
        Node postNode=node.next;
        Node newNode=new Node();
        newNode.val=x;
        newNode.next=postNode;
        node.next=newNode;
        return root;
    }
}
