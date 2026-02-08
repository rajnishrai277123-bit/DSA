public class copyconstructor{
    public static void main(){
     Student s1=new Student();
     s1.name="raju";
     s1.roll=123;
     s1.password="xyz";
     s1.marks[0]=11;
     s1.marks[1]=12;
     s1.marks[2]=34;
     Student s2=new Student(s1);
     s2.password="rty";
     s1.marks[1]=100;
     for(int i=0;i<3;i++){
        System.out.println(s2.marks[i]);
     }
     //System.out.println(s2.marks);
     
    }
}
class Student{
    String name;
    int roll;
    String password;
    int marks[];
   // int marks[];
    //copy constructor
    Student(Student s1){
        marks=new int[3];

        this.name=s1.name;
        this.roll=s1.roll;
        this.marks=s1.marks;
    }
    //non parameterised
    Student(){
         marks=new int[3];

        System.out.println("constructor called");
    }
    //parammeterised
    Student(String name){
         marks=new int[3];
        this.name=name;
    }
    Student(int roll){
         marks=new int[3];
        this.roll=roll;
    }
}