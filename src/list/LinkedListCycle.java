package list;

/**
 * 
 * @author qianwang.wq
 * @version $Id: LinkedListCycle.java, v 0.1 2017年4月25日 下午3:47:05 qianwang.wq Exp $
 */
public class LinkedListCycle {

    class ListNode {
        int      val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        ListNode p = head;
        ListNode p2step = head;

        while (p != null && p2step != null) {
            p = p.next;
            p2step = (p2step.next == null) ? null : p2step.next.next;
            if (p2step == p && p != null) {
                return true;
            }
        }

        return false;

    }

    /**
     * 
     * @param args
     */
    public static void main(String[] args) {

    }

}
