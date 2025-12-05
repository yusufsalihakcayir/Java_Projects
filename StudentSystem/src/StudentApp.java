public class StudentApp {
    public static void main(String[] args) {
        MasterStudent m = new MasterStudent(1, 70, 80, 3);
        BachelorStudent b = new BachelorStudent(2, 60, 75);
        PhDStudent p = new PhDStudent(3, 85, 90, 4);

        System.out.println("Master Total: " + m.computeTotalScore());
        System.out.println("Bachelor Total: " + b.computeTotalScore());
        System.out.println("PhD Total: " + p.computeTotalScore());
    }
}