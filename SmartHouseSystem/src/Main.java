public class Main {
    public static void main(String[] args) {

        SmartDevice[] devices = new SmartDevice[3];

        devices[0] = new SmartLight("Philips Hue", "Gün Işığı");
        devices[1] = new Thermostat("Nest", 24.5);
        devices[2] = new RobotVacuum("Xiaomi", 500);

        System.out.println("--- AKILLI EV SİSTEMİ BAŞLATILIYOR ---\n");

        for (SmartDevice device : devices) {

            device.operate();

            if (device instanceof WifiEnabled) {
                ((WifiEnabled) device).connectToNetwork("SuperOnline_5G");
            }

            if (device instanceof Rechargeable) {
                ((Rechargeable) device).chargeBattery();
            }

            System.out.println("--------------------------------------");
        }
    }
}