import java.time.LocalDate;
import java.util.List;

public class Faculty extends Employee {
    private List<String> coursesTaught;

    public Faculty(String name, String address, String phoneNumber, String email, String officeLocation, double salary, LocalDate hireDate, List<String> coursesTaught) {
        super(name, address, phoneNumber, email, officeLocation, salary, hireDate);
        this.coursesTaught = coursesTaught;
    }

    // Override toString method
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\nCourses Taught: ").append(coursesTaught);
        return sb.toString();
    }

    // Getter for coursesTaught
    public List<String> getCoursesTaught() {
        return coursesTaught;
    }
}
