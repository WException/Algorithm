package leetcode;
// TODO 待做
public class lc_21_合并两个有序链表 {

}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution2 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode res = new ListNode();
        ListNode tmp1 = new ListNode();
        ListNode tmp2 = new ListNode();
//        while(true){
//            if(list1.val > list2.val){
//                res.val = list2.val;
//            }
//        }
        return res;
    }
}