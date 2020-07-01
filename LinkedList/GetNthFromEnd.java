class GetNthFromEnd {
    Node head;

    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    void append(int data){
        Node current = head;
        Node new_node = new Node(data);

        if(head == null){
            head = new_node;
            new_node.next = null;
            return;
        }

        while(current.next != null){
            current = current.next;
        }
        current.next = new_node;
        new_node.next = null;
    }

    // The function will let you fetch node based on the index from the end of the node
    int GetNthElementFromEnd (int index){
        Node temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        if(index > count){
            return 0;
        }
        temp = head;
        int end = count - index;
        for(int i = 1; i < end + 1; i ++)
            temp = temp.next;
        return temp.data;

    }

    void printlist(){
        Node current = head;
        while(current != null){
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        GetNthFromEnd list = new GetNthFromEnd();
        list.append(3);
        list.append(10);
        list.append(32);
        list.append(2);
        list.printlist();
        System.out.println(list.GetNthElementFromEnd(1));
    }
}