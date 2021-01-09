class LinkedNode {
    public int data;
    public LinkedNode next = null;
}
public class LinkedList {
    public void removeAllkey(int toRemove) {
        if (head == null) {
            return;
        }
        LinkedNode prev = head;
        LinkedNode cur = head.next;
        while (cur != null) {
            if (cur.data == toRemove) {
                prev.next = cur.next;
                cur = cur.next;
            } else {
                prev = cur;
                cur = cur.next;
            }
        }
        if (this.head.data == toRemove) {
            this.head = this.head.next;
        }
        return;
    }
    public ListNode reverseList(ListNode head) {
        // 1. 对于空链表, 不需要任何处理
        if (head == null) {
            return null;
        }
        // 2. 对于只有一个元素的链表, 也不需要处理
        if (head.next == null) {
            return head;
        }
        // 3. 如果有多个节点
        ListNode newHead = null;
        ListNode cur = head;
        ListNode prev = null;
        while (cur != null) {
            ListNode next = cur.next;
            if (next == null) {
                newHead = cur;
            }
            // 翻转指针的指向
            cur.next = prev;
            // 更新 prev 和 cur
            prev = cur;
            cur = next;
        }
        return newHead;
    }

    public ListNode middleNode(ListNode head) {
        // 1. 得到链表的长度
        int steps = size(head) / 2;
        // 2. 根据长度的一半移动 cur 的位置
        ListNode cur = head;
        for (int i = 0; i < steps; i++) {
            cur = cur.next;
        }
        return cur;
    }

    public ListNode FindKthToTail(ListNode head,int k) {
        int length = size(head);
        if (head == null || k <= 0 || k > length) {
            return null;
        }
        int offset = length - k;
        ListNode cur = head;
        for (int i = 0; i < offset; i++) {
            cur = cur.next;
        }
        return cur;
    }

    public int size(ListNode head) {
        int size = 0;
        for (ListNode cur = head;
             cur != null; cur = cur.next) {
            size++;
        }
        return size;
    }
}
