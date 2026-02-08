public class exponation{
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        int fmn1=power(x,n-1);
        int fn=x *power(x,n-1);
        return fn;
    }
    public static void main(String[] args){
        System.out.println(power(2,5));

    }
}