import java.util.Scanner;

public class Fourteen {
   static class TreeNode{
        char value;
        TreeNode lchild;
        TreeNode rchild;
        public TreeNode(char value){
            this.value=value;

        }
    }
    static TreeNode node=new TreeNode('0');
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str1="FDXEAG";
        String str2="XDEFAG";
        char[] l1=str1.toCharArray();
        char[] l2=str2.toCharArray();
        Get(l1,l2,0,l1.length-1);
        //System.out.print(node.value);
        //System.out.print(node.lchild.value);
        //System.out.print(node.rchild.value);
        //Post(node);
        /*
        if(scanner.hasNext()){
            str1=scanner.next();
        }
        if(scanner.hasNext()){
            str2=scanner.next();
        }

         */
    }
    static TreeNode Get(char[] str1,char[] str2,int low,int high){
        node.value=str1[low];
        int index=0;
        for(int i=0;i<high;i++){
            if(str1[low]==str2[i]){
                index=i;
                break;
            }
        }
        System.out.print(index);
        if(index!=low){
            node.lchild=Get(str1,str2,low+1,index-1);
            System.out.print(node.lchild.value);
        }
        if(index!=high){
            node.rchild=Get(str1,str2,index+1,high-1);
            System.out.print(node.rchild.value);
        }
        return node;
    }
    static void Post(TreeNode node){
        if(node.lchild!=null){
            System.out.print(node.lchild.value);
            Post(node.lchild);
        }

        if(node.rchild!=null){
            System.out.print(node.rchild.value);
            Post(node.rchild);
        }
        System.out.print(node.value);
    }
}
