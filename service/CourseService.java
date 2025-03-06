package service;

import java.util.ArrayList;
import java.util.List;
import model.Course;
import model.person.Faculty;
import model.person.Student;

public class CourseService {
    private List<Course> courses;

    public CourseService() {
        this.courses = new ArrayList<>();
    }

    // Add a new course
    public void addCourse(Course course) {
        courses.add(course);
    }
    public void addPrerequisite(int courseCode, Course prerequisite) {
        Course course = getCourseByCode(courseCode);
        if (course != null) {
            course.getPrerequisites().add(prerequisite);
        }
    }

   public void addCorequisite(int courseCode, Course corequisite) {
    Course course = getCourseByCode(courseCode);
    if (course != null) {
        course.getCorerequisites().add(corequisite); // Corrected method name
    }
}


    // Remove a course by course code
    public boolean removeCourse(int courseCode) {
        return courses.removeIf(course -> course.getCourseCode() == courseCode);
    }

    // Find a course by course code
    public Course getCourseByCode(int courseCode) {
        for (Course course : courses) {
            if (course.getCourseCode() == courseCode) {
                return course;
            }
        }
        return null;
    }

    // Get all courses
    public List<Course> getAllCourses() {
        return courses;
    }

    // Update course details
    public boolean updateCourse(int courseCode, String title, String description, int credits, char passingGrade, Faculty teacher) {
        Course course = getCourseByCode(courseCode);
        if (course != null) {
            course.setTitle(title);
            course.setDescription(description);
            course.setCredits(credits);
            course.setPassingGrade(passingGrade);
            course.setTeacher(teacher);
            return true;
        }
        return false;
    }

    // Enroll a student in a course
    public boolean enrollStudent(int courseCode, Student student) {
        Course course = getCourseByCode(courseCode);
        if (course != null) {
            course.getStudents().add(student);
            return true;
        }
        return false;
    }

    // Get students enrolled in a course
    public List<Student> getStudentsInCourse(int courseCode) {
        Course course = getCourseByCode(courseCode);
        return (course != null) ? course.getStudents() : new ArrayList<>();
    }
}
