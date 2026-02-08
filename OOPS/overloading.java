public class overloading{
    public static void main(String[] args){
        calculator c=new calculator();
        System.out.println(c.sum(2,3));
        System.out.println(c.sum((float)5.4,(float)6.5));

    }
}
class calculator{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
}