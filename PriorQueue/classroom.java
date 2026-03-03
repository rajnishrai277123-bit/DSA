import java.util.PriorityQueue;
public class classroom{
    static class Student implements Comparable<Student> {
        String name;
        int grade;
        public Student(String name, int grade){
            this.name = name;
            this.grade = grade;
        }
        @Override
        public int compareTo(Student s2) {
            return this.grade - s2.grade; // Ascending order based on grade
        }

    }
}