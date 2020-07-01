class printMiddle{
    Node head;

    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

    void append(int d){
        Node temp = head;
        Node new_node = new Node(d);
        if(head == null){
            head = new_node;
            new_node.next = null;
            return;
        }
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = new_node;
    }

    void printMiddleNode(){
        Node temp = head;
        float count = 0;
        if(temp == null){
            return;
        }
        while(temp!= null){
            count++;
            temp = temp.next;
        }
        temp = head;
        int mid = Math.round(count / 2);
        for(int i = 1; i < mid; i++ )
            temp = temp.next;
        System.out.println(temp.data); 
    }

    // Implementation with two pointers
    void printMiddlePtrs(){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        System.out.println(slow.data);
    }

    void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printMiddle ll = new printMiddle();
        ll.append(32);
        ll.append(12);
        ll.append(50);
        ll.append(3);
        ll.append(2);
        ll.append(2);
        ll.append(1);
        ll.printList();
        // ll.printMiddleNode();
        ll.printMiddlePtrs();
    }
}