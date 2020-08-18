public class DLL {
    Node head;
    class Node{
        int data;
        Node prev;
        Node next;

        Node(int d){
            data = d;
        }
    }

    public void push(int data){
        // 1. Create a new node with the given input data
        Node new_node = new Node(data);

        // 2. Assign the next pointer of new node to head
        // 3. And mark the prev of new node to null

        new_node.next = head;
        new_node.prev = null;

        // 4. If Head is not null, then make its prev point to next of new node 
        if(head != null){
            head.prev = new_node;
        }
        // 5. As it is an insertion operation, shift the head pointer to new created node

        head = new_node;
    }

    public void append(int data){
        Node new_node = new Node(data);
        Node last = head;

        if(head == null){
            head = new_node;
        }
        else
        {
            while(last.next != null){
                last = last.next;
            }
            last.next = new_node;
            new_node.prev = last;
        }
    }

    public void insertAfter(Node prev_node, int data){
        Node new_node = new Node(data);
        // Make next of new_node equals to next of prev node
        new_node.next = prev_node.next;
        // make the prev of new node point to prev node
        new_node.prev = prev_node;
        // make the next of prev node point to new node
        prev_node.next = new_node;
        // if next of new node is not null make its prev point to new node
        if(new_node.next != null){
            new_node.next.prev = new_node;
        }
    }

    public void insertBefore(Node next_node, int data){
        // If next node is null return it
        if(next_node == null){
            return;
        }
        // Create a new node and allocate the data in it
        Node new_node = new Node(data);
        // Set the prev of new node to prev of next node
        new_node.prev = next_node.prev;
        // Set the next of new node point to next node
        new_node.next = next_node;

        // If prev of next node is null then make the next node of prev node point to new node
        // else make the new node point to head and change the new head
        if(next_node.prev != null){
            next_node.prev.next = new_node;
        }else{
            new_node.next = head;
            head = new_node;
        }
    }

    public void printList(){
        Node n = head;
        System.out.print("DLL Elements are: ");
        while(n != null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DLL dl = new DLL();
        // dl.push(12);
        // dl.push(13);
        // dl.push(14);
        // dl.push(80);
        dl.append(5);
        dl.append(9);
        dl.append(78);
        dl.printList();
        dl.insertBefore(dl.head, 999);
        // dl.insertAfter(dl.head, 20);
        dl.printList();
    }
}