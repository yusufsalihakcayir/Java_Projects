public class CanonOffice extends Printer implements Faxable,Scanable{

    @Override
    public void fax() {
        System.out.println("Faxing...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning...");
    }
}
