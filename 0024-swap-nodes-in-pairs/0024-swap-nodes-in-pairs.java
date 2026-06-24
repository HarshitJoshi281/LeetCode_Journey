/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null)return head;
        ListNode temp = head;
        int count= 1;
        while(temp.next!=null){
            if(count%2!=0){
                int temp2=temp.next.val;
                temp.next.val=temp.val;
                temp.val = temp2;
                count++;
                temp = temp.next;
            }
            else{count++;temp=temp.next;} 
        }
        return head;
    }
}