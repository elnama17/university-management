package model;

import java.util.ArrayList;
import model.person.Faculty;
import model.person.Student;

public class Course {
    private String title;
    private String description;
    private int courseCode;
    private int credits;
    private int CRN;
    private char passingGrade;
    private ArrayList<Course> prerequisites;
    private ArrayList<Course> corerequisites;
    private ArrayList<Student> students;
    private Faculty teacher;

    public Course(String title, String description, int courseCode, int credits, int CRN, char passingGrade, 
                  ArrayList<Course> prerequisites, ArrayList<Course> corerequisites, 
                  ArrayList<Student> students, Faculty teacher) {
        this.title = title;
        this.description = description;
        this.courseCode = courseCode;
        this.credits = credits;
        this.CRN = CRN;
        this.passingGrade = passingGrade;
        this.prerequisites = prerequisites;
        this.corerequisites = corerequisites; // Fixed typo
        this.students = students;
        this.teacher = teacher;
    }

    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public int getCourseCode() { return courseCode; }
    public int getCredits() { return credits; }
    public int getCRN() { return CRN; }
    public char getPassingGrade() { return passingGrade; }
    public ArrayList<Course> getPrerequisites() { return prerequisites; }
    public ArrayList<Course> getCorerequisites() { return corerequisites; } // Fixed getter
    public ArrayList<Student> getStudents() { return students; }
    public Faculty getTeacher() { return teacher; }

    public void setTitle(String title) { this.title = title; }
    public void setDescription(String description) { this.description = description; }
    public void setCourseCode(int courseCode) { this.courseCode = courseCode; }
    public void setCredits(int credits) { this.credits = credits; }
    public void setCRN(int CRN) { this.CRN = CRN; }
    public void setPassingGrade(char passingGrade) { this.passingGrade = passingGrade; }
    public void setPrerequisites(ArrayList<Course> prerequisites) { this.prerequisites = prerequisites; }
    public void setCorerequisites(ArrayList<Course> corerequisites) { this.corerequisites = corerequisites; } // Added setter
    public void setStudents(ArrayList<Student> students) { this.students = students; }
    public void setTeacher(Faculty teacher) { this.teacher = teacher; }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", courseCode=" + courseCode +
                ", credits=" + credits +
                ", CRN=" + CRN +
                ", passingGrade=" + passingGrade +
                ", students=" + students +
                ", prerequisites=" + prerequisites +
                ", corerequisites=" + corerequisites + 
                '}';
    }
}
