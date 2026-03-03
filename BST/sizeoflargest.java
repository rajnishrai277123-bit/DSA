public class sizeoflargest {
    static class Node{
        int data;
        Node left, right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class Info{
        int size;
        int min;
        int max;
        boolean isBST;
        public Info(int size, int min, int max, boolean isBST){
            this.size = size;
            this.min = min;
            this.max = max;
            this.isBST = isBST;
        }
    }
    public static maxBST=0;
    public static Info largestBST(Node root){
        if(root == null){
            return new Info(0, Integer.MAX_VALUE, Integer.MIN_VALUE, true);
        }
        Info leftInfo = largestBST(root.left);
        Info rightInfo = largestBST(root.right);
        int size = leftInfo.size + rightInfo.size + 1;
        int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
        int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));
        boolean isBST = leftInfo.isBST && rightInfo.isBST && root.data > leftInfo.max && root.data < rightInfo.min;
        if(isBST){
            maxBST = Math.max(maxBST, size);
        }
        return new Info(size, min, max, isBST);
    }
    public static void main(String[] args) {
        Node root = new Node(data:50);
        root.left = new Node(data:30);
        root.left.left = new Node(data:5);
        root.left.right = new Node(data:20);
        root.right = new Node(data:60);
        root.right.right = new Node(data:70);
        root.right.right.right = new Node(data:80);
        root.right.left = new Node(data:45);
        root.right.right.left = new Node(data:65);
        largestBST(root);
        System.out.println(maxBST);
    }