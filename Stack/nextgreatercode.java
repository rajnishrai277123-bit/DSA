import java.util.*;
public class nextgreatercode{
    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 4,3,1};
        Stack<Integer> s = new Stack<>();
        int ans[] = new int[arr.length];
        for(int i=arr.length-1; i>=0; i--){
            while(!s.isEmpty() && s.peek() <= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                ans[i] = -1;
            }
            else{
                ans[i] = s.peek();
            }
            s.push(arr[i]);
        }
        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
        }
    }
}