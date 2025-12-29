public class Main {
    public static void main(String[] args) {

        System.out.println("--- Canon Basic ---");
        CanonBasic basicPrinter = new CanonBasic();
        basicPrinter.print();
        basicPrinter.scan();
        System.out.println();

        System.out.println("--- Canon Office ---");
        CanonOffice officePrinter = new CanonOffice();
        officePrinter.print();
        officePrinter.scan();
        officePrinter.fax();

        System.out.println();

        System.out.println("--- Canon Professional ---");
        CanonProfessional proPrinter = new CanonProfessional();
        proPrinter.print();
        proPrinter.scan();
        proPrinter.fax();
        proPrinter.printColor();

    }
}