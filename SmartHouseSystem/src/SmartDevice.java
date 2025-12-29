public abstract class SmartDevice {

    private String brand;
    private boolean isOn;

    public SmartDevice(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public abstract void operate();
    }

