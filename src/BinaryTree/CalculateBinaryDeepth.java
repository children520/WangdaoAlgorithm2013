package BinaryTree;

/**
 * 计算机二叉树的深度
 */
public class CalculateBinaryDeepth {
    static  int left=0;
    static int right=0;
    static int res=0;
    public static void main(String[] args) {
        TreeNode node1=new TreeNode(1);
        TreeNode node2=new TreeNode(2);
        TreeNode node3=new TreeNode(3);
        TreeNode node4=new TreeNode(4);
        TreeNode node5=new TreeNode(5);
        TreeNode node6=new TreeNode(6);
        TreeNode node7=new TreeNode(7);
        node1.left=node2;
        node2.right=node3;
        node1.right=node4;
        node4.left=node5;
        node5.right=node6;
        node6.left=node7;
        int result=calculateBinaryDeepth(node1);
        System.out.println(result);
    }
    static int calculateBinaryDeepth(TreeNode node){
        if(node==null){
            return res;
        }else {
            left=calculateBinaryDeepth(node.left);
            System.out.println();
            right=calculateBinaryDeepth(node.right);
            res=1+ left>right?left:right;

        }
        return res;

    }
}
