public class BasePlusCommissionEmployee extends CommissionEmployee {

    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, int SSN, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, SSN, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {return baseSalary;}

    @Override
    public double earning() {
        return super.earning() +  baseSalary ;
    }

    @Override
    public String toString() {
        return super.toString() + " Base Salary: " + baseSalary;
    }
}
