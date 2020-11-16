/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 *
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头
 *
 */

  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class add_two_numbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int l1Sum=0;
        int l1Index=0;
        double l2Sum=0;
        int l2Index=0;
        while (l1!=null){
            l1Sum+=(l1.val*Math.pow(10,l1Index));
            l1Index++;
            l1=l1.next;
        }
        while (l2!=null){
            l2Sum+=(l2.val*Math.pow(10,l2Index));
            l2Index++;
            l2=l2.next;
        }
        System.out.println(l1Sum);
        System.out.println(l2Sum);
        double result=l1Sum+l2Sum;
        System.out.println(result);
        //result=10009998;
        ListNode resultNode=new ListNode((int)result%10);
        result=result/10;
        ListNode curNode=resultNode;
        while ((result%10!=result)){
            ListNode node=new ListNode((int)result%10);
            result=result/10;
            resultNode.next=node;
            resultNode=node;
        }
        System.out.println();
        while (curNode!=null){
            System.out.print(curNode.val+" ");
            curNode=curNode.next;
        }
        return curNode;
    }
//public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//    ListNode curl1=l1;
//    ListNode curl2=l2;
//    int l1length=0;
//    int l2length=0;
//    while (curl1!=null){
//        l1length++;
//        curl1=curl1.next;
//    }
//    while (curl2!=null){
//        l2length++;
//        curl2=curl2.next;
//    }
//    curl1=l1;
//    curl2=l2;
//    int curl1Index=0;
//    int curl2Index=0;
//    boolean cf=false;
//    if(l1length>=l2length){
//        System.out.println("=");
//        for (int i=0;i<l1length;i++){
//            if(curl1Index==(l1length-l2length)){
//                int curValue=curl1.val+ curl2.val;
//                if(cf){
//                    curValue++;
//                }
//                System.out.println(curValue);
//                if((curValue)>=10){
//                    cf=true;
//                    curl1.val=curValue%10;
//                }else {
//                    cf=false;
//                    curl1.val=curValue;
//                }
//                curl2=curl2.next;
//                curl1Index++;
//            }
//            curl1=curl1.next;
//            curl1Index++;
//        }
//    }else {
//        for (int i=0;i<l2length;i++){
//            if(curl2Index==(l2length-l1length)){
//                int curValue=curl1.val+ curl2.val;
//                if(cf){
//                    curValue++;
//                }
//                if((curValue)>=10){
//                    cf=true;
//                    curl2.val=curValue%10;
//                }else {
//                    curl2.val=curValue;
//                }
//            }
//            curl1=curl1.next;
//            curl1Index++;
//        }
//    }
//    return l1length>l2length ? l1 : l2;
//}


    public static void main(String[] args) {
        ListNode node1=new ListNode(2);
        ListNode node2=new ListNode(4);
        ListNode node3=new ListNode(3);
        node1.next=node2;
        node2.next=node3;
        ListNode node4=new ListNode(5);
        ListNode node5=new ListNode(6);
        ListNode node6=new ListNode(4);
        node4.next=node5;
        node5.next=node6;
        addTwoNumbers(node1,node4);

    }
}
