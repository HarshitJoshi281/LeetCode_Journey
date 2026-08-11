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
    public void reorderList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode slow =head;
        ListNode fast = head;
        while(fast.next!=null&&fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode temp = slow.next;
        slow.next = null;
        while(temp!=null){
            stack.push(temp);
            temp=temp.next;
        }
        ListNode curr = head;
        while(!stack.isEmpty()){
            ListNode last = stack.pop();
            ListNode next = curr.next;
            curr.next = last;
            last.next = next;
            curr=next;
        }




    }
}