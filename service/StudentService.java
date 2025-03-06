package service;

import java.util.List;
import model.Course;
import model.person.Student;

public class StudentService {
    private List<Course> courses;
    //get courses that student is enrolled in 
    public boolean addCourse(Course course) {
        if(course!=null){
        courses.add(course);
        return true;
    }
    return false;
    }
    // Enroll a student in a course
    public boolean enrollStudentInCourse(Student student, Course course) {
        if (student != null && course != null) {
            // Prevent enrolling if the course is already added
            if (!student.getCourses().contains(course)) {
                student.getCourses().add(course);
                return true;
            }
        }
        return false;
    }

    // Withdraw a student from a course
    public boolean withdrawStudentFromCourse(Student student, int courseCode) {
        if (student != null) {
            return student.withdrawFromCourse(courseCode);
        }
        return false;
    }

    // Update student's major
    public void updateStudentMajor(Student student, String major) {
        if (student != null && major != null && !major.isEmpty()) {
            student.setMajor(major);
        }
    }

    // Update student's thesis title
    public void updateThesisTitle(Student student, String thesisTitle) {
        if (student != null && thesisTitle != null && !thesisTitle.isEmpty()) {
            student.setThesisTitle(thesisTitle);
        }
    }

    // Update student's semester
    public void updateStudentSemester(Student student, int semester) {
        if (student != null && semester > 0) {
            student.setSemester(semester);
        }
    }

    // Get the student's CGPA
    public double calculateCGPA(Student student) {
        if (student != null) {
            return student.getCGPA();
        }
        return 0.0;
    }

    // Get student's full details (string representation)
    public String getStudentDetails(Student student) {
        if (student != null) {
            return student.toString();
        }
        return "Student not found.";
    }

    // Check if a student is eligible for internship (based on CGPA and semester)
    public boolean isEligibleForBeingTA(Student student) {
        if (student != null) {
            return student.getCGPA() >= 3.0 && student.getSemester() >= 5; // Example eligibility criteria
        }
        return false;
    }

    // Check if a student is a teaching assistant
    public boolean isTeachingAssistant(Student student) {
        if (student != null) {
            return student.isTA();
        }
        return false;
    }
}
