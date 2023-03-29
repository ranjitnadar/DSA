// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class ReversedLinkedList {
    static ListNode head;
    static class ListNode{
        int data;
        ListNode next;
        ListNode(int value){
            data = value;
            next = null;
        }
    }
    ListNode reversedLinkedList(ListNode A){
        ListNode prev = null;
        ListNode curr = A;
        ListNode next = null;
        
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            
            prev = curr;
            curr = next;
        }
        return prev;
    }
    void printLinkedList(ListNode A){
        while(A != null){
             System.out.print(A.data + " ");
            A = A.next;
        }
    }
    public static void main(String[] args) {
        ReversedLinkedList list = new ReversedLinkedList();
        list.head = new ListNode(1);
        list.head.next = new ListNode(2);
        list.head.next.next = new ListNode(3);
        list.head.next.next.next = new ListNode(4);
        System.out.println("Linked List");
        list.printLinkedList(head);
        
        System.out.println("\nReversed Linked List");
        
        head = list.reversedLinkedList(head);
        list.printLinkedList(head);        
    }
}
