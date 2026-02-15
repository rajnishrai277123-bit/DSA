import java.util.*;
public class areaofhistogram {
    public static int largestRectangleArea(int[] heights) {
        Stack<Integer> s = new Stack<>();
        int maxArea = 0;
        for(int i=0; i<heights.length; i++){
            while(!s.isEmpty() && heights[s.peek()] > heights[i]){
                int height = heights[s.pop()];
                int width = s.isEmpty() ? i : i - s.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            s.push(i);
        }
        while(!s.isEmpty()){
            int height = heights[s.pop()];
            int width = s.isEmpty() ? heights.length : heights.length - s.peek() - 1;
            maxArea = Math.max(maxArea, height * width);
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 6, 2, 3};
        System.out.println(largestRectangleArea(arr));
    }
}