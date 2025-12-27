public class HourlyEmployee extends Employee {

    private double wage;
    private int hours;

    public HourlyEmployee(String firstName, String lastName, int SSN, double wage, int hours) {
        super(firstName, lastName, SSN);
        this.wage = wage;
        this.hours = hours;
    }
    public double getWage() {return wage;}
    public int getHours() {return hours;}

    @Override
    public double earning() {
        if (hours <=40) return wage*hours;
        else return 40*wage+(hours-40)*wage*1.5;
    }

    @Override
    public String toString() {
        return super.toString() + " Hourly Wage : " + wage + " Hours Worked : " + hours;
    }
}
