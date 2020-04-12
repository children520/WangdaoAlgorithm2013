package BinaryTree;

import java.util.Stack;

public class InOrderBinaryTree {
    static Stack<TreeNode> stack=new Stack<>();
    static void InOrderBinaryTree(TreeNode node){
        TreeNode curNode=node;
        while (curNode!=null||!stack.isEmpty()){
            while (curNode!=null){
                stack.push(curNode.left);
                curNode=curNode.left;
            }
            if(!stack.isEmpty()){
                stack.pop();
                System.out.println(curNode.val);
                curNode=curNode.right;
            }
        }
    }
}
