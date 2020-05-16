package LinkedList;

/**
 * 根据两个升序的链表
 * 返回一个新链表
 */
public class MergeTwoAscLinkList_LeetCode_21 {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode first=l1;
        ListNode second=l2;
        ListNode third=new ListNode(0);
        ListNode start=third;
        while (first!=null&&second!=null){
            if (first.val<=second.val){
                third.next=first;
                first=first.next;
            }else{
                third.next=second;
                second=second.next;
            }
            third=third.next;
        }
        while (first!=null){
            third.next=first;
            first=first.next;
            third=third.next;
        }

        while (second!=null){
            third.next=second;
            second=second.next;
            third=third.next;
        }
        return start.next;
    }

    public static void main(String[] args) {
        ListNode l1=new ListNode(-9);
        ListNode l2=new ListNode(3);
        l1.next=l2;
        ListNode m1=new ListNode(5);
        ListNode m2=new ListNode(7);
        //ListNode m3=new ListNode(4);
        m1.next=m2;
        //m2.next=m3;
        ListNode l=mergeTwoLists(l1,m1);
        while (l!=null){
            System.out.println(l.val+"");
            l=l.next;
        }

    }
}
class ListNode{
    ListNode next;
    int val;
    public ListNode(int val){
        this.val=val;
    }
}
