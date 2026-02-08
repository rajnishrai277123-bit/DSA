public class sumnatural{
    public static int fact(int n){
        if(n==1){
            return 1;
            
        }
        
        int fnm=fact(n-1);
        int fn=n+fact(n-1);
        return fn;

    }
    public static void main(String[] args){
        int n=10;
        System.out.println(fact(n));
    }
}