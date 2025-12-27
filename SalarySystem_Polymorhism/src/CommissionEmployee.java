public class CommissionEmployee extends Employee {

    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, int SSN, double grossSales, double commissionRate) {
        super(firstName, lastName, SSN);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {return grossSales;}
    public double getCommissionRate() {return commissionRate;}

    @Override
    public double earning() {
        return commissionRate*grossSales/100;
    }

    @Override
    public String toString() {
        return super.toString() + "grossSales=" + grossSales + ", commissionRate=" + commissionRate + '}';
    }
}
