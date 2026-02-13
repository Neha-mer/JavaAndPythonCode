package CodingQuesnthirty;

import java.util.LinkedList;

class ListNode
{
    int val;
    ListNode next;

    ListNode(int val)
    {
        this.val = val;
    }
}

 class MergeTwoSortedLinkedList {
     public static void main(String[] args) {


         ListNode dummy = new ListNode(0);
         ListNode current = dummy;

         ListNode l1 = new ListNode(1);
         l1.next = new ListNode(3);
         l1.next.next = new ListNode(5);

         // Create second sorted list: 2 -> 4 -> 6
         ListNode l2 = new ListNode(6);
         l2.next = new ListNode(7);
         l2.next.next = new ListNode(8);

         //Merge Two Sorted Lists: Merge two sorted linked lists and return it as a new sorted
         //list.

         //{2->4->5}
         //{6->7->8}

         //listNode 1

         while (l1 != null && l2 != null) {

             if (l1.val <= l2.val) {
                 current.next = l1;
                 l1 = l1.next;
             } else {
                 current.next = l2;
                 l2 = l2.next;
             }
             current = current.next;

         }
             if (l1 != null) {
                 current.next = l1.next;
             }
             if (l2 != null) {
                 current.next = l2.next;

             }



         ListNode temp = dummy.next;   // skip dummy
         while (temp != null) {
             System.out.print(temp.val + " -> ");
             temp = temp.next;
         }

     }
 }
