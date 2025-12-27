public class Main {
    public static void main(String[] args) {

        Employee e1 = new SalariedEmployee("Ali","Al",20896,14689.65 );
        Employee e2 = new HourlyEmployee("Ceyhun","Safi",20658,140.55,8);
        Employee e3 = new CommissionEmployee("Derya","Fal",20156,1000,17);
        Employee e4 = new BasePlusCommissionEmployee("Semih","Hakkı",20456,1450,12,10625.47 );

        Employee[] emps = new Employee[]{e1,e2,e3,e4};

        for (Employee e : emps) {
            System.out.println(e);
            System.out.printf("ÖDENECEK MAAŞ: %.2f TL\n", e.earning());
        }
    }
}