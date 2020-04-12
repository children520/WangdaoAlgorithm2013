package BinaryTree;

import java.util.Stack;

public class PostOrderBinaryTree {
    static Stack<TreeNode> stack=new Stack<>();
    static void PostOrderBinaryTree(TreeNode node){
        TreeNode curNode=node;
        while (true){
            if(curNode!=null){
                if(curNode.right!=null){
                    System.out.println("right:"+curNode.right.val);
                    stack.push(curNode.right);
                }
                System.out.println("cur:"+curNode.val);
                stack.push(curNode);
                curNode=curNode.left;
                continue;
            }
            if(stack.isEmpty()){
                return;
            }
            curNode=stack.pop();
            if(curNode.right!=null&&!stack.isEmpty()&&curNode.right==stack.peek()){
                stack.pop();
                stack.push(curNode);
                curNode=curNode.right;
            }else {
                System.out.println(curNode.val);
                curNode=null;
            }

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
        PostOrderBinaryTree(rootNode);
    }
}
