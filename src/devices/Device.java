package devices;

import interfaces.sellable;

public abstract class Device implements sellable{
    final String producer;
    final String model;
    final Integer yearOfProduction;
    Boolean isOn;
    protected boolean isNew;

    public Device(String producer, String model, Integer yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.isOn = false;
        this.isNew = true;
    }

    public abstract void turnOn();

    public abstract void turnOff();

    public boolean IsNew() {
        return this.isNew;
    }

    public String toString() {
        return String.format("""
                Producer: %s
                Model: %s
                Year of production: %s
                """, this.producer, this.model, this.yearOfProduction);
    }
}
