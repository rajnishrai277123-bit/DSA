public class printinrange {
    static class Node{
        int data;
        Node left, right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void printInRange(Node root, int k1, int k2){
        if(root == null){
            return;
        }
        if(root.data >= k1 && root.data <= k2){
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        } else if(root.data < k1){
            printInRange(root.right, k1, k2);
        } else {
            printInRange(root.left, k1, k2);
        }
    }
    public static void main(String[] args) {
        Node root = null;
        int[] values = {5, 3, 7, 2, 4, 6, 8};
        for(int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        }
        int k1 = 4, k2 = 7;
        printInRange(root, k1, k2);
    }
}