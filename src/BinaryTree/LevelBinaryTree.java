package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelBinaryTree {
    static Queue<TreeNode> queue=new LinkedList<>();
    static void LevelBinaryTree(TreeNode node){
        TreeNode curNode=node;
        queue.add(curNode);
        while (!queue.isEmpty()){
            TreeNode startNode=queue.peek();
           if(curNode.left!=null){
               queue.add(startNode.left);
           }
           if(curNode.right!=null){
               queue.add(startNode.right);
           }
           System.out.println(startNode.val);
           queue.poll();

        }
    }

    public static void main(String[] args) {
        TreeNode rootNode =new TreeNode(40);
        TreeNode node20=new TreeNode(20);
        TreeNode node10=new TreeNode(10);
        TreeNode node30=new TreeNode(30);
        TreeNode node60=new TreeNode(60);
        TreeNode node50=new TreeNode(50);
        TreeNode node70=new TreeNode(70);

        rootNode.left=node20;
        rootNode.right=node60;

        node20.left=node10;
        node20.right=node30;

        node60.left=node50;
        node60.right=node70;
        LevelBinaryTree(rootNode);

    }

}
