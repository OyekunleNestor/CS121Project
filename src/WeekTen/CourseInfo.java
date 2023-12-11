package WeekTen;

import java.util.ArrayList;

public class CourseInfo {
    private ArrayList<String> courseNames = new ArrayList<>();
    private ArrayList<Double> gpas = new ArrayList<>();
    private ArrayList<Character> letterGrades = new ArrayList<>();
    private ArrayList<Integer> scores = new ArrayList<>();

    public void addCourse(String courseName, double gpa, char letterGrade, int score) {
        courseNames.add(courseName);
        gpas.add(gpa);
        letterGrades.add(letterGrade);
        scores.add(score);
    }

    public void displayCourseInfo() {
        System.out.printf("%-20s%-5s%-8s%-12s\n", "Course Name", "GPA", "Grade", "Score");
        for (int i = 0; i < courseNames.size(); i++) {
            System.out.printf("%-20s%-5.2f%-8c%-12d\n", courseNames.get(i), gpas.get(i), letterGrades.get(i), scores.get(i));
        }
    }
}
