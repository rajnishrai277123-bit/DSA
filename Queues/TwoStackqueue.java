import java.util.*;
public class TwoStackqueue {
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();
    public static void add(int data){
        s1.push(data);
    }
    public static int remove(){
        if(s1.isEmpty() && s2.isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }
    public static int peek(){
        if(s1.isEmpty() && s2.isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }
    public static void main(String[] args) {
        add(1);
        add(2);
        add(3);
        while(!s1.isEmpty() || !s2.isEmpty()){
            System.out.println(peek());
            remove();
        }
    }
}