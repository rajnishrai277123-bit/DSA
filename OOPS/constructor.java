public class constructor{
    public static void main(){
     Student s1=new Student();
     Student s2=new Student("Rajnish");
     Student s3=new Student(123);
     System.out.println(s2.name);
     System.out.println(s3.roll);
     System.out.println(s1);

    }
}
class Student{
    String name;
    int roll;
    Student(){
        System.out.println("constructor called");
    }
    Student(String name){
        this.name=name;
    }
    Student(int roll){
        this.roll=roll;
    }
}