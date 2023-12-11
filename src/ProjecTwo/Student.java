package ProjecTwo;

import java.util.ArrayList;

public class Student {
    private String studentName;
    private ArrayList<Course> courses;

    public Student(String name) {
        this.studentName = name;
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public String getStudentName() {
        return studentName;
    }

    public double calculateGPA() {
        // You can implement GPA calculation logic here based on course grades.
        // For simplicity, let's assume a straightforward calculation.
        double totalCredits = 0;
        double totalPoints = 0;

        for (Course course : courses) {
            totalCredits += course.getCourseCredits();
            // Add logic to calculate points based on grades and accumulate them.
        }

        return totalPoints / totalCredits;
    }
}
