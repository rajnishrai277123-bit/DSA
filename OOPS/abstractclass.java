public class abstractclass{
    public static void main(String[] args){
     horse h=new horse();
     h.eat();
     h.walk();
     chicken c=new chicken();
     c.eat();
     c.walk();

    }
}
abstract class Animal{
    void eat(){
        System.out.println("eats");
    }
    abstract void walk();
}
class horse extends Animal{
    void walk(){
        System.out.println("4legs");
    }
}
class chicken extends Animal{
    void walk(){
        System.out.println("2legs");
    }
}