import java.util.ArrayList;
import java.util.List;

class Student extends Person {
    public static final String SENIOR = "Senior";
    public static final String JUNIOR = "Junior";
    public static final String SOPHOMORE = "Sophomore";
    public static final String FRESHMAN = "Freshman";

    private String classStatus;
    private List<Course> enrolledCourses; //field to store enrolled courses

    public Student(String name, String address, String phoneNumber, String email, String classStatus) {
        super(name, address, phoneNumber, email);
        this.classStatus = classStatus;
        this.enrolledCourses = new ArrayList<>(); // Initialize the enrolled courses list
    }

    public String getClassStatus() {
        return classStatus;
    }

    // Method to add enrolled course
    public void enrollCourse(Course course) {
        enrolledCourses.add(course);
    }

    // Method to retrieve enrolled courses
    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    @Override
    public String toString() {
        return super.toString() + "\nClass Status: " + classStatus;
    }
}
