import java.util.ArrayList;
import java.util.List;

public class CourseImpl implements Course {
    private String courseName;
    private Faculty faculty;
    private List<Staff> staffList;
    private List<Student> enrolledStudents;

    public CourseImpl(String courseName) {
        this.courseName = courseName;
        this.staffList = new ArrayList<>();
        this.enrolledStudents = new ArrayList<>();
    }

    @Override
    public String getCourseName() {
        return courseName;
    }

    @Override
    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    @Override
    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    @Override
    public void addStaff(Staff staff) {
        staffList.add(staff);
    }

    @Override
    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    @Override
    public Faculty getFaculty() {
        return faculty;
    }

    @Override
    public List<Staff> getStaffList() {
        return staffList;
    }
}
