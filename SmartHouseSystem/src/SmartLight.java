public class SmartLight extends SmartDevice implements WifiEnabled {

    private String color;
    private int brightness = 50;

    public SmartLight(String brand, String color) {
        super(brand);
        this.color = color;
    }

    public void changeColor(String color) {
        this.color = color;
    }

    @Override
    public void operate() {
        System.out.println(getBrand() + " akıllı ışık devreye giriyor...");
        System.out.println("-> Parlaklık Seviyesi: %" + brightness);
        System.out.println("-> Seçili Renk: " + color);
    }

    @Override
    public void connectToNetwork(String ssid) {
        System.out.println(getBrand() + " cihazı '" + ssid + "' Wifi ağına başarıyla bağlandı.");
    }

    @Override
    public void disconnect() {

    }
}
