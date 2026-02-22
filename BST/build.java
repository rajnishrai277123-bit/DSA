public class build {
    static class Node{
        int data;
        Node left, right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public  static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }
        if(data < root.data){
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
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
        Node root = null;
        int[] values = {5, 3, 7, 2, 4, 6, 8};
        for(int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        }
        inorder(root);
        

    }
}