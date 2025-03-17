import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // Instances of Person, Student, Employee, Faculty, and Staff
        Person person = new Person("Natalie Doe", "123 Main St", "555-555-5551", "natalie.doe@gmail.com");
        Student student = new Student("Alice Smith", "456 Wines Way", "555-555-5552", "alice.smith@yahoo.com", Student.SENIOR);
        Employee employee = new Employee("Bob Joe", "789 Nelson Ct", "555-555-5553", "bob.joe@hotmail.com", "Office A", 50000, LocalDate.now());
        
        // List of employees
        List<Employee> employees = new ArrayList<>();
        
        // Create Faculty
        Faculty faculty1 = new Faculty("Emma Lee", "321 Boulder Dr", "555-555-5554", "emma.lee@outlook.com", "Office B", 60000, LocalDate.now(), List.of("CSC100", "CSC200"));
        employees.add(faculty1); 

        Faculty faculty2 = new Faculty("Jane Smith", "789 Elm St", "555-555-5556", "jane.smith@hotmail.com", "Office D", 65000, LocalDate.now(), List.of("CSC200", "CSC330"));
        employees.add(faculty2); 

        Faculty faculty3 = new Faculty("Jessica Martinez", "852 Pine St", "555-555-5565", "jessica.martinez@example.com", "Office M", 78000, LocalDate.now(), List.of("CSC340", "CSC330"));
        employees.add(faculty3);

        Faculty faculty4 = new Faculty("Sophia Wilson", "963 Magnolia St", "555-555-5572", "sophia.wilson@example.com", "Office T", 70000, LocalDate.now(), List.of("CSC200", "CSC330", "CSC335"));
        employees.add(faculty4);

        Faculty faculty5 = new Faculty("William Garcia", "852 Cedar St", "555-555-5573", "william.garcia@example.com", "Office U", 75000, LocalDate.now(), List.of("CSC200", "CSC340"));
        employees.add(faculty5);

        Faculty faculty6 = new Faculty("Olivia Brown", "147 Maple St", "555-555-5574", "olivia.brown@example.com", "Office V", 72000, LocalDate.now(), List.of("CSC100"));
        employees.add(faculty6);


        // Define titles for Staff
        List<String> titles = List.of("Education Coordinator", "Registrar", "Program Manager", "Assistant", "Support Staff");

        // Create Staff
        Staff staff1 = new Staff("John Wiles", "654 Groove St", "555-555-5555", "john.wiles@wilmu.edu.com", "Office C", 40000, LocalDate.now(), "Registrar");
        employees.add(staff1); 
     
        Staff staff2 = new Staff("Mike Johnson", "123 Oak St", "555-555-5557", "mike.johnson@yahoo.com", "Office E", 45000, LocalDate.now(), "Education Coordinator");
        employees.add(staff2); 

        Staff staff3 = new Staff("Alex Harris", "951 Maple St", "555-555-5566", "alex.harris@example.com", "Office N", 43000, LocalDate.now(), "Program Manager");
        employees.add(staff3);

        Staff staff4 = new Staff("Lisa Miller", "369 Cedar St", "555-555-5567", "lisa.miller@example.com", "Office O", 39000, LocalDate.now(), "Support Staff");
        employees.add(staff4);

        // Create a list of students
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice Smith", "456 Wines Way", "555-555-5552", "alice.smith@yahoo.com", Student.SENIOR));
        students.add(new Student("Emma Watson", "789 Park Ave", "555-555-5558", "emma.watson@example.com", Student.JUNIOR));
        students.add(new Student("Chris Evans", "456 Pine St", "555-555-5559", "chris.evans@example.com", Student.SOPHOMORE));
        students.add(new Student("Scarlett Johansson", "147 Elm St", "555-555-5560", "scarlett.johansson@example.com", Student.FRESHMAN));
        students.add(new Student("Tom Holland", "369 Oak St", "555-555-5561", "tom.holland@example.com", Student.SENIOR));

        // Create a list of courses
        List<Course> courses = new ArrayList<>();
        CourseImpl course1 = new CourseImpl("CSC100");
        CourseImpl course2 = new CourseImpl("CSC200");
        CourseImpl course3 = new CourseImpl("CSC330");
        CourseImpl course4 = new CourseImpl("CSC340");
        CourseImpl course5 = new CourseImpl("CSC325");
        CourseImpl course6 = new CourseImpl("CSC335");
        courses.add(course1);
        courses.add(course2);
        courses.add(course3);
        courses.add(course4);
        courses.add(course5);
        courses.add(course6);

        // Enroll students in courses
        int coursesPerStudent = 3;
        for (Student currStudent : students) { // Iterate through the list of students
        Set<Course> enrolledCourses = new HashSet<>();
        int enrolledCount = 0;
        while (enrolledCount < coursesPerStudent) {
            Course course = courses.get((int) (Math.random() * courses.size()));
            if (enrolledCourses.add(course)) { // Check if course is not already added
            course.enrollStudent(currStudent); 
            enrolledCount++;
         }
     }
 }

        // Set faculty and staff for each course
        course1.setFaculty(faculty1);
        course2.setFaculty(faculty2);
        course3.setFaculty(faculty3);
        course4.setFaculty(faculty4);
        course5.setFaculty(faculty5);
        course6.setFaculty(faculty6);
        course1.addStaff(staff1);
        course2.addStaff(staff2);
        course3.addStaff(staff3);
        course4.addStaff(staff4);


        // Print the list of courses and their details
        for (Course course : courses) {
            System.out.println("Course Name: " + course.getCourseName());
            System.out.println(); //extra line for readability purposes!!

        // Print assigned students
        System.out.println("Assigned Students:");
        List<Student> enrolledStudents = course.getEnrolledStudents();
        if (enrolledStudents.isEmpty()) {
            System.out.println("No students enrolled");
        } else {
            for (Student enrolledStudent : enrolledStudents) { // Rename the loop variable **CHECK THIS
                System.out.println("- Name: " + enrolledStudent.getName());
                System.out.println("  Address: " + enrolledStudent.getAddress());
                System.out.println("  Phone Number: " + enrolledStudent.getPhoneNumber());
                System.out.println("  Email: " + enrolledStudent.getEmail());
                System.out.println("  Class Status: " + enrolledStudent.getClassStatus());
                System.out.println(); //extra line for readability purposes!!
            }
        }

    
        // Print assigned faculty and faculty details
        Faculty faculty = course.getFaculty();
        if (faculty != null) {
            System.out.println("Assigned Faculty: " + faculty.getName());
            System.out.println();
            System.out.println("Faculty Details:");
            System.out.println("  Office Location: " + faculty.getOfficeLocation());
            System.out.println("  Salary: " + faculty.getSalary());
            System.out.println("  Hire Date: " + faculty.getHireDate());
            System.out.println("  Courses Taught: " + faculty.getCoursesTaught());
        } else {
            System.out.println("No faculty assigned");
        }
        
        System.out.println();//extra line for readability purposes!! **BREAK

            
        // Print assigned staff and staff details
        System.out.println("Assigned Staff:");
        List<Staff> staffList = course.getStaffList();
        if (staffList.isEmpty()) {
            System.out.println("No staff assigned");
        } else {
            for (Staff staff : staffList) {
                System.out.println("- Name: " + staff.getName());
                System.out.println("  Office Location: " + staff.getOfficeLocation());
                System.out.println("  Salary: " + staff.getSalary());
                System.out.println("  Hire Date: " + staff.getHireDate());
                System.out.println("  Title: " + staff.getTitle());
            }
        }
    
    System.out.println(); //extra line for readability purposes!! **BREAK
}

    }
}  
