public class overriding{
    public static void main(String[] args){
        dog p=new dog();
        p.eat();

    }
}
class Animal{
    void eat(){
        System.out.println("eats food");
    }
}
class dog extends Animal{
    void eat(){
        System.out.println("eats grass");
    }
}