class LinkedListBasics{
    Node head;

    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    void push(int d){
        // Node n = head;
        Node new_node = new Node(d);
        new_node.next = head;
        head = new_node;
    }

    void insertAfterNode(Node prev, int data){
        // Node n = head;
        if(prev == null){
            System.out.println("Previous node cannot be null");
            return;
        }
        Node new_node = new Node(data);
        new_node.next = prev.next;
        prev.next = new_node;
    }

    void append(int d){
        Node new_node = new Node(d);
        if(head == null){
            head = new Node(d);
            return;
        }
        new_node.next = null;
        Node last = head;
        while(last.next != null){
            last = last.next;
        }
        last.next = new_node;
        return;
    }

    void deleteNode(int key){
        Node tnode = head;
        Node prev = null;
        if(tnode == null){
            System.out.println("Linked list is empty");
            return;
        }
        if(tnode != null && tnode.data == key){
            head = tnode.next;
            return;
        }
        while(tnode.data != key && tnode != null){
            prev = tnode;
            tnode = tnode.next;
        }
        prev.next = tnode.next;
    }

    // Deletes a node from linkedList from a specified position
    void deleteNodeAtPosition(int pos){
        Node tnode = head;
        Node prev = null;

        int count = 0;
        if(tnode == null){
            return;
        }
        if(tnode != null && pos == count){
            head = tnode.next;
            return;
        }
        while(tnode != null && pos != count){
            prev = tnode;
            tnode = tnode.next;
            count ++;
        }
        if (pos == count){
            prev.next = tnode.next;
            return;
        }
    }

    // Deletes an Entire linked list
    void delete(){
        head = null;
    }

    void getCount(){
        int count = 0;
        Node tnode = head;
        while(tnode != null){
            count ++;
            tnode = tnode.next;
        }
        System.out.println(count);
        return;
    }

    // Driver Function to calculate length of Linked list recursively
    
    int getRecursiveCount(Node node){
        if(node == null){
            return 0;
        }
        else{
            return 1 + getRecursiveCount(node.next);
        }

    }
    // Function to calculate length of Linked list recursively

    void recCount(){
        System.out.println(getRecursiveCount(head));
    }

    // Iterative function to check if element is present in the linked list

    boolean find(int key){
        Node temp = head;
        
        while(temp!= null){
            if(temp.data == key)
                return true;
            else
                temp = temp.next;
        }
        return false;
    }

    // Recursive function to check if element is present in the linked list
    
    boolean findRecursiveDriver(Node node, int key){
        if(node == null){
            return false;
        }
        if(node.data == key){
            return true;
        }else{
            return findRecursiveDriver(node.next, key);
        }
        
    }

    void findRecursive(int key){
        System.out.println(findRecursiveDriver(head,key));
        
    }

    void printList() 
    { 
        Node tnode = head; 
        while (tnode != null) 
        { 
            System.out.print(tnode.data+" "); 
            tnode = tnode.next; 
        } 
        System.out.println();
    } 

    public static void main(String args[]){
        LinkedListBasics ll = new LinkedListBasics();
        ll.append(2);
        ll.append(3);
        ll.append(4);
        // ll.insertAfterNode(ll.head.next, 8);
        ll.append(10);
        ll.append(15);
        ll.printList();
        ll.deleteNodeAtPosition(4);
        // ll.deleteNode(3);
        // ll.delete();
        // ll.recCount();
        // System.out.println(ll.find(15));
        // ll.findRecursive(0);
        // ll.getCount();
        ll.printList();

    }
}