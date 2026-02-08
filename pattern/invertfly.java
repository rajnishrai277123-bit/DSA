public class invertfly{
    public static void flytriangle(int n){
        int count=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count+"");
                count++;
            }
            for(int j=1;j<=n-1;j++){
                System.out.print("");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        flytriangle(5);

    }
}