package devices;
public class Car extends Device{
    public Double price;
    public Integer engineDisplacement;
    public String typeOfFuel;
    public String power;
    public String color;


    public Car(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
    }

    public String toString() {
        return String.format("""
                Producer: %s
                Model: %s
                Year of production: %s
                Price: %.2f
                Engine displacement: %s 
                Type of fuel: %s
                Power: %s
                Color: %s
                is on: %s
                """, this.producer, this.model, this.yearOfProduction, this.price, this.engineDisplacement, this.typeOfFuel, this.power, this.color, this.isOn);
    }

    @Override
    public void turnOn() {
        System.out.println("turning on the car engine");
        this.isOn = true;
    }

    @Override
    public void turnOff() {
        System.out.println("turning off the car engine");
        this.isOn = false;
    }
}
