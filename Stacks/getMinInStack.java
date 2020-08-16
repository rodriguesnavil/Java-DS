import java.util.*;

public class getMinInStack extends Stack<Integer>{
    Stack<Integer> min = new Stack<>();

    // public void push(int x){
    //     if(isEmpty()){
    //         super.push(x);
    //         min.push(x);
    //     }else{
    //         super.push(x);
    //         int y = min.peek();
    //         if(x <= y)
    //             min.push(x);
    //         else
    //             min.push(y);
            
    //     }
    // }



    //  The above push method can be improved, we can push the incoming element only when
    //  the element is smaller than or equal to top of auxiliary stack
    //  Below is optimized version

    public void push(int x){
        if(isEmpty()){
            super.push(x);
            min.push(x);
        }else{
            super.push(x);
            int y = min.peek();
            if(x <= y){
                min.push(x);
            }
        }
    }

    
    // public Integer pop(){
    //     if(isEmpty()){
    //         System.out.println("Stack is empty");
    //         System.exit(0);
    //     }
    //     int x = super.pop();
    //     min.pop();
    //     return x;
    // }

    // In the below pop method, the element will be popped from Auxiliary stack 
    // only when the element is equal to top of original stack

    public Integer pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty!");
            System.exit(0);
        }
            int x = super.pop();
            if(x == min.peek())
                min.pop();
            return x;
    }

    public int getMin(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            System.exit(0);
        }
        int x = min.peek();
        return x;
    }

    public static void main(String[] args) {
        getMinInStack m = new getMinInStack();
        m.push(1);
        m.push(9);
        m.push(5);
        // System.out.println("Poppeed El <><> "+m.pop());
        // System.out.println("Poppeed El <><> "+m.pop());
        // System.out.println("Poppeed El <><> "+m.pop());
        System.out.println("get Min <><> "+m.getMin());
    }
}