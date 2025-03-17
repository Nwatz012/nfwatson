import java.time.LocalDate;

class Employee extends Person {
    private String officeLocation;
    private double salary;
    private LocalDate hireDate;

    public Employee(String name, String address, String phoneNumber, String email, String officeLocation, double salary, LocalDate hireDate) {
        super(name, address, phoneNumber, email);
        this.officeLocation = officeLocation;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    // Getter methods
    public String getOfficeLocation() {
        return officeLocation;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    @Override
    public String toString() {
        return super.toString() + "\nOffice Location: " + officeLocation + "\nSalary: " + salary + "\nHire Date: " + hireDate;
    }
}
