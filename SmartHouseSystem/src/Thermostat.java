public class Thermostat extends SmartDevice implements WifiEnabled{

    private double temperature;

    public Thermostat(String brand, double startTemp) {
        super(brand);
        temperature = startTemp;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public void operate() {
        System.out.println(getBrand() + " akıllı termostat devreye giriyor...");
        System.out.println("-> Sıcaklık Seviyesi: " + temperature);
    }

    @Override
    public void connectToNetwork(String ssid) {
        System.out.println(getBrand() + " cihazı '" + ssid + "' Wifi ağına başarıyla bağlandı.");
    }

    @Override
    public void disconnect() {

    }
}
