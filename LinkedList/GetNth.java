class GetNth{
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
        Node temp = head;
        Node new_node = new Node(data);
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

    // void GetNthNode(int index){
    //     Node temp = head;
    //     int count = 0;

    //     if(head == null){
    //         return;
    //     }
    //     while(temp != null && count != index){
    //         temp = temp.next;
    //         count ++;
    //     }
    //     if(count == index){
    //         System.out.println("The element at "+index+" is "+temp.data);
    //     }
    // }

    int GetNthNode(int index){
        Node temp = head;
        int count = 0;

        while(temp != null){
            if(count == index){
                return temp.data;
            }
            count++;
            temp = temp.next;
        }
        assert(false);
        return 0;
    }

    void printList(){
        Node temp = head;
        if(head == null){
            return;
        }
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        GetNth ll = new GetNth();
        ll.append(2);
        ll.append(9);
        ll.append(1);
        ll.append(5);
        ll.append(32);
        ll.append(10);
        ll.append(8);
        ll.printList();
        System.out.println("Element at index 7 is "+ll.GetNthNode(7));
    }
}