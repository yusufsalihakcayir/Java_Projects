public class RobotVacuum extends SmartDevice implements WifiEnabled, Rechargeable{

    private int dustCapacity;

    public RobotVacuum(String brand, int dustCapacity) {
        super(brand);
        this.dustCapacity = dustCapacity;
    }

    public void cleanRoom(){
        System.out.println("Haritalama yapılıyor ve zemin süpürülüyor...");
    }

    @Override
    public void operate() {
        System.out.println(getBrand() + " robot süpürge devreye giriyor...");
        int currentBattery = getBatteryLevel();
        System.out.println("-> Pil Seviyesi: %" + currentBattery);
        System.out.println("-> Toz Haznesi Kapasitesi: " + dustCapacity + " ml");
        if (currentBattery > 10) {
            System.out.println("Sensörler kontrol ediliyor...");
            cleanRoom();
        } else {
            System.out.println("UYARI: Pil çok düşük! Temizliğe başlanamıyor, şarja dönüyor.");
        }
        System.out.println("");
    }

    @Override
    public void connectToNetwork(String ssid) {
        System.out.println(getBrand() + " cihazı '" + ssid + "' Wifi ağına başarıyla bağlandı.");
    }

    @Override
    public void disconnect() {

    }

    @Override
    public void chargeBattery() {
        System.out.println(getBrand() + " şarj istasyonuna bağlandı, pil doluyor...");
    }

    @Override
    public int getBatteryLevel() {
        return 45;
    }
}
