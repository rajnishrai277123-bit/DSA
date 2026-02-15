import java.util.*;
public class stackdeque{
    static class Stack{
        Deque<Integer> dq = new LinkedList<>();
        public void push(int data){
            dq.addLast(data);
        }
        public void pop(){
            if(dq.isEmpty()){
                System.out.println("Stack is empty");
                return;
            }
            dq.removeLast();
        }
        public int peek(){
            if(dq.isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            return dq.getLast();
        }
        public boolean isEmpty(){
            return dq.isEmpty();
    }
}
    public static void main(String[] args) {
        Stack Stack = new Stack();
        Stack.push(1);
        Stack.push(2);
        Stack.push(3);
        while(!Stack.isEmpty()){
            System.out.println(Stack.peek());
            Stack.pop();
        }
    }
}