package BinaryTree;

import java.util.Stack;

public class PreOrderBinaryTree {
    static Stack<TreeNode> stack=new Stack<>();
    static void PreOrderBinaryTree(TreeNode node){
        TreeNode curNode=node;
        while (curNode!=null||!stack.isEmpty()){
            while (curNode!=null){
                System.out.println(curNode.val);
                stack.push(curNode);
                curNode=curNode.left;
            }
            if(!stack.isEmpty()){
                curNode=stack.pop();
                curNode=curNode.right;
            }
        }
    }

    public static void main(String[] args) {
        TreeNode node1=new TreeNode(2);
        TreeNode node2=new TreeNode(6);
        TreeNode node3=new TreeNode(4);
        TreeNode node4=new TreeNode(1);
        node1.left=node2;
        node1.right=node3;
        node2.left=node4;
        PreOrderBinaryTree(node1);
    }
}

