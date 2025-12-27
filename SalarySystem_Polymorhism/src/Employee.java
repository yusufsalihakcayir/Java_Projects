public abstract class Employee {

    private String firstName;
    private String lastName;
    private int SSN;

    public Employee(String firstName, String lastName, int SSN) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = SSN;
    }

    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public int getSSN() {return SSN;}



    public abstract double earning();

    @Override
    public String toString() {
        return "FirstName: " + firstName + ", LastName: " + lastName + ", SSN: " + SSN;
    }
}
