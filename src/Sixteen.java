public class Sixteen {
    static class TreeNode{
        int value;
        TreeNode lchild;
        TreeNode rchild;
        TreeNode(int value){
            this.value=value;
        }

    }
    static TreeNode Insert(TreeNode node,int x){
        if(node==null){
            node=new TreeNode(x);
            //System.out.println(1);
            return node;
        }else if(x<node.value){
            //System.out.println(2);
            node.lchild=Insert(node.lchild,x);
        }else if(x>node.value){
            //System.out.println(3);
            node.rchild=Insert(node.rchild,x);
        }

        return node;
    }
    static int[] list={1,6,5,9,8};
    static TreeNode node;
    public static void main(String[] args) {
        for(int i:list){
            node=Insert(node,i);
        }
        System.out.println();
        Post(node);



    }
    static void Post(TreeNode newnode){
        if(newnode.lchild!=null){
            //System.out.println(newnode.lchild.value);
            Post(newnode.lchild);
        }

        if(newnode.rchild!=null){
            //System.out.println(newnode.rchild.value);
            Post(newnode.rchild);
        }
        System.out.println(newnode.value);
    }
}
