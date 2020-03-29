public class Seventeen {
    public static void main(String[] args) {
        int[] list1={5,6,7,4,3,2};
        int[] list2={5,7,6,3,4,2};
        TreeNode node1 = null,node2=null;
        StringBuilder builder1=new StringBuilder();
        StringBuilder builder2=new StringBuilder();
        Seventeen seventeen=new Seventeen();
        for(int i:list1){
            node1=seventeen.insert(node1,i);
        }
        for (int i:list2){
            node2=seventeen.insert(node2,i);
        }
        seventeen.Pre(node1,builder1);
        seventeen.Pre(node2, builder2);
        seventeen.Mid(node1,builder1);
        seventeen.Mid(node2, builder2);
        System.out.print(builder1.toString().equals(builder2.toString()));

    }
    static class TreeNode{
        int val;
        TreeNode lchild;
        TreeNode rchild;
        TreeNode(int val){
            this.val=val;
        }
    }
    TreeNode insert(TreeNode node,int k){
        if(node==null){
            node=new TreeNode(k);
            return node;
        }else if(k<node.val){
            node.lchild=insert(node.lchild,k);
        }else if(k>node.val){
            node.rchild=insert(node.rchild,k);
        }
        return node;
    }
    void Pre(TreeNode node,StringBuilder builder){
        if(node!=null){
            builder.append(node.val);

        }
        if(node.lchild!=null){
            Pre(node.lchild,builder);
        }
        if(node.rchild!=null){
            Pre(node.rchild,builder);
        }
    }
    void Mid(TreeNode node,StringBuilder builder){
        if(node.lchild!=null){
            Mid(node.lchild,builder);
        }
        if(node!=null){
            builder.append(node.val);

        }
        if(node.rchild!=null){
            Mid(node.rchild,builder);
        }
    }
}
