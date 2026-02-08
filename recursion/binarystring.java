public class binarystring {
    public static void binaryString(int n, int lastplace, String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
        // choice 1: add 0
        binaryString(n-1, 0, ans+"0");
        // choice 2: add 1
        if(lastplace != 1){
            binaryString(n-1, 1, ans+"1");
        }
    }
    public static void main(String[] args) {
        int n = 3;
        binaryString(n, -1, "");
    }
}