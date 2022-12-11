package devices;

public abstract class Device {
    final String producer;
    final String model;
    final Integer yearOfProduction;
    Boolean isOn;

    public Device(String producer, String model, Integer yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.isOn = false;
    }

    public abstract void turnOn();

    public abstract void turnOff();

    public String toString() {
        return String.format("""
                Producer: %s
                Model: %s
                Year of production: %s
                """, this.producer, this.model, this.yearOfProduction);
    }
}
