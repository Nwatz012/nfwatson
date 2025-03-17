import java.util.List;

public interface Course {
    String getCourseName();
    void enrollStudent(Student student);
    void setFaculty(Faculty faculty);
    void addStaff(Staff staff);
    List<Student> getEnrolledStudents();
    Faculty getFaculty();
    List<Staff> getStaffList();
}
