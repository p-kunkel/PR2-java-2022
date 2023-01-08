package devices;

import creatures.Human;

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

    @Override
    public void turnOn() {
        System.out.println("turning on the phone");
        this.isOn = true;
        
    }

    @Override
    public void turnOff() {
        System.out.println("turning off the phone");
        this.isOn = false;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.phone == null) {
            System.out.println("Seller don't have phone to sell!");
            return;
        }

        if (!buyer.makeTransaction(seller, price)) {
            return;
        }

        this.isNew = false;
        buyer.phone = seller.phone;
        seller.phone = null;

        System.out.printf("Transaction completed. %s bought the phone.\n", buyer.firstName);
    }
}
