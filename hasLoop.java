public boolean hasLoop(ListNode head) {
    ListNode slow = head, fast = head;

    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.nexxt.next;

        if(slow== fast) {
            return true;
        }
        return false;
    }
}
