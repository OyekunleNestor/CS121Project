package ProjecTwo;

import java.util.ArrayList;

public class School {
    private ArrayList<Student> students;

    public School() {
        this.students = new ArrayList<>();
    }

    public void enrollStudent(Student student) {
        students.add(student);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public static void main(String[] args) {
        // Example usage
        Student student1 = new Student("John Doe");
        student1.addCourse(new Course("Math", 4));
        student1.addCourse(new Course("English", 3));

        Student student2 = new Student("Jane Smith");
        student2.addCourse(new Course("History", 3));
        student2.addCourse(new Course("Science", 4));

        School school = new School();
        school.enrollStudent(student1);
        school.enrollStudent(student2);

        // Displaying modified data or result
        for (Student student : school.getStudents()) {
            System.out.println(student.getStudentName() + "'s GPA: " + student.calculateGPA());
        }
    }
}
