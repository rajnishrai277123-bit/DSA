import java.util.*;
public class subtree {
    static class Node{
        int data;
        Node left, right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static boolean isIdentical(Node root1, Node root2){
        if(root1 == null && root2 == null){
            return true;
        }
        if(root1 == null || root2 == null){
            return false;
        }
        return (root1.data == root2.data) && isIdentical(root1.left, root2.left) && isIdentical(root1.right, root2.right);
    }
    public static boolean isSubtree(Node mainRoot, Node subRoot){
        if(subRoot == null){
            return true;
        }
        if(mainRoot == null){
            return false;
        }
        if(isIdentical(mainRoot, subRoot)){
            return true;
        }
        return isSubtree(mainRoot.left, subRoot) || isSubtree(mainRoot.right, subRoot);
    }
    public static void main(String[] args) {
        Node mainRoot = new Node(1);
        mainRoot.left = new Node(2);
        mainRoot.right = new Node(3);
        mainRoot.left.left = new Node(4);
        mainRoot.left.right = new Node(5);
        mainRoot.left.left.left = new Node(6);

        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);

        System.out.println(isSubtree(mainRoot, subRoot));
    }
}