import java.util.*;
class QUS {
    static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();
        // Implement Queue using stacks (Making enQueue operation costly)
        // The idea is to keep the latest element on top of stack s1
        // Time complexity for Push operation: O(n)
        // Time complexity for Pop operation: O(1)

        // void enQueue(int x){
        //     while(!s1.isEmpty()){
        //         s2.push(s1.pop());
        //     }
        //     s1.add(x);
        //     while(!s2.isEmpty()){
        //         s1.push(s2.pop());
        //     }
        // }

        // int deQueue(){
        //     if(s1.isEmpty()){
        //         System.out.println("Queue is empty");
        //         System.exit(0);
        //     }
        //         int x = s1.pop();
        //         return x;
        // }

        // Implement Queue using By making Dequeue operation costly
        // The idea is to move all the elements from s1 to s2 at the time of deQueue operation
        // Time complexity for Push operation: O(1)
        // Time complexity for Pop operation: O(n)

    //     void enQueue(int x){
    //         s1.add(x);
    //     }

    //     int deQueue(){
    //         if(s1.isEmpty() && s2.isEmpty()){
    //             System.out.println("No elements to deQueue");
    //             System.exit(0);
    //         }
    //         if(s2.isEmpty()){
    //         while(!s1.isEmpty()){
    //             s2.add(s1.pop());
    //         }
    //     }
    //     return s2.pop();
    //   }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.enQueue(4);
        q.enQueue(12);
        q.enQueue(10);
        q.enQueue(1);
        q.enQueue(0);
        System.out.println("Popped element is "+q.deQueue());
        System.out.println("Popped element is "+q.deQueue());
        System.out.println("Popped element is "+q.deQueue());
    }
}