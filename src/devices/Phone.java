package devices;
public class Phone extends Device{
    final Double screenSize;
    public String operatingSystem;

    public Phone(String producer, String model, Integer yearOfProduction, Double screenSize) {
        super(producer, model, yearOfProduction);
        this.screenSize = screenSize;
    }

    public String toString() {
        return String.format("""
                Producer: %s
                Model: %s
                Screen size: %s
                Operating system: %s
                Year of production: %s
                is on: %s
                """, this.producer, this.model, this.screenSize, this.operatingSystem, this.yearOfProduction, this.isOn);
    }
}
