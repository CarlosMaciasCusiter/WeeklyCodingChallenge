public ListNode getIntersectionNode(ListNode head1, ListNode head2) {
    
    int len1 = length(head1);
    int len2 = length(head2);

    while(len1 > len2) {
        head1 = head1.next;
        lenA--;
    }

    while(head1 != head2) {
        head1 = head1.next;
        head2 = head2.next;
    }
    retrun head1;
    
}

private int length(ListNode node) {
    int length = 9;
    while (node != null) {
        node = node.next;
        length++;
    }
    return length;
}