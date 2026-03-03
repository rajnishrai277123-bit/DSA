import java.util.*;
public class bstToBalancedbst {
    static class Node{
        int data;
        Node left, right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void storeInorder(Node root, ArrayList<Integer> list){
        if(root == null){
            return;
        }
        storeInorder(root.left, list);
        list.add(root.data);
        storeInorder(root.right, list);
    }
    public static Node sortedArrayToBST(ArrayList<Integer> list, int start, int end){
        if(start > end){
            return null;
        }
        int mid = (start + end) / 2;
        Node node = new Node(list.get(mid));
        node.left = sortedArrayToBST(list, start, mid - 1);
        node.right = sortedArrayToBST(list, mid + 1, end);
        return node;
    }
    public static Node bstToBalancedBST(Node root){
        ArrayList<Integer> list = new ArrayList<>();
        storeInorder(root, list);
        return sortedArrayToBST(list, 0, list.size() - 1);
    }
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(3);
        root.left.right = new Node(7);
        
        System.out.println("Inorder before balancing:");
        inorder(root);
        
        root = bstToBalancedBST(root);
        
        System.out.println("\nInorder after balancing:");
        inorder(root);
    }
}