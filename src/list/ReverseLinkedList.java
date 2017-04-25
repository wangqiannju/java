/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package list;


public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode nextHead = reverseList(head.next);
        if (nextHead != null) {
            nextHead.next = head;
        }
        head.next = null;
        return head;
    }

    /**
     * 
     * @param args
     */
    public static void main(String[] args) {

    }

}
