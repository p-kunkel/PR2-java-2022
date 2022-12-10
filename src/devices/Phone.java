package devices;
public class Phone {
    final String producer;
    final String model;

    public String operatingSystem;

    public Phone(String producer, String model) {
        this.producer = producer;
        this.model = model;
    }

    public String toString() {
        return String.format("""
                Producer: %s
                Model: %s
                Operating system: %s
                """, this.producer, this.model, this.operatingSystem);
    }
}
