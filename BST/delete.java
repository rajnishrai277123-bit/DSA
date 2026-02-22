public class delete {
    static class Node{
        int data;
        Node left, right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static Node insert(Node root, int data){
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
    public static Node delete(Node root, int key){
        if(root == null){
            return null;
        }
        if(key < root.data){
            root.left = delete(root.left, key);
        } else if(key > root.data){
            root.right = delete(root.right, key);
        } else {
            if(root.left == null){
                return root.right;
            } else if(root.right == null){
                return root.left;
            }
            Node successor = findMin(root.right);
            root.data = successor.data;
            root.right = delete(root.right, successor.data);
        }
        return root;
    }
    public static Node findMin(Node node){
        while(node.left != null){
            node = node.left;
        }
        return node;
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
        System.out.println("Inorder before deletion:");
        inorder(root);
        
        int keyToDelete = 3;
        root = delete(root, keyToDelete);
        
        System.out.println("\nInorder after deletion of " + keyToDelete + ":");
        inorder(root);
    }
}