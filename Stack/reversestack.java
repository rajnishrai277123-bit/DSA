import java.util.*;
public class reversestack {
    public static void reverseStack(Stack<Integer> s){
        Stack<Integer> helper = new Stack<>();
        while(!s.isEmpty()){
            helper.push(s.pop());
        }
        while(!helper.isEmpty()){
            s.push(helper.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        reverseStack(s);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}