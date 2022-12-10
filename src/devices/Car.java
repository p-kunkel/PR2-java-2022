package devices;
public class Car {
    final String producer;
    final String model;
    final Integer yearOfProduction;

    public Double price;
    public Integer engineDisplacement;
    public String typeOfFuel;
    public String power;
    public String color;


    public Car(String producer, String model, Integer yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
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
                """, this.producer, this.model, this.yearOfProduction, this.price, this.engineDisplacement, this.typeOfFuel, this.power, this.color);
    }
}
