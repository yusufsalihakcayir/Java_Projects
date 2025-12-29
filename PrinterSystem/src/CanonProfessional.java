public class CanonProfessional extends Printer implements ColorPrintable,Faxable,Scanable{

    @Override
    public void printColor() {
        System.out.println("Color Printing...");
    }

    @Override
    public void fax() {
        System.out.println("Faxing...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning...");
    }
}
