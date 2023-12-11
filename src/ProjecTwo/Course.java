package ProjecTwo;

public class Course {
    private String courseName;
    private int courseCredits;

    public Course(String name, int credits) {
        this.courseName = name;
        this.courseCredits = credits;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCourseCredits() {
        return courseCredits;
    }
}
