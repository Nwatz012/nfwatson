import java.time.LocalDate;


class Staff extends Employee {
    private String title;

    public Staff(String name, String address, String phoneNumber, String email, String officeLocation, double salary, LocalDate hireDate, String title) {
        super(name, address, phoneNumber, email, officeLocation, salary, hireDate);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTitle: " + title;
    }
}
