public class uniqueSbtring{
   static class Node{
        Node children[] = new Node[26];
        boolean eow = false;
        public Node(){
            for(int i=0; i<26; i++){
                children[i] = null;
            }
        }
    }
    public static Node root = new Node();
    public static void insert(String word){
        int level = 0;
        int len = word.length();
        int idx = 0;
        Node curr = root;
        for(level=0; level<len; level++){
            idx = word.charAt(level) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        public static boolean search(String key){
            int level = 0;
            int len = key.length();
            int idx = 0;
            Node curr = root;
            for(level=0; level<len; level++){
                idx = key.charAt(level) - 'a';
                if(curr.children[idx] == null){
                    return false;
                }
                curr = curr.children[idx];
            }
            return curr.eow == true;
        }
    
    
   
    public static void main(String[] args) {

    }
}