public class Car {
    final String producer;
    final String model;
    final Integer yearOfProduction;

    Double price;
    Integer engineDisplacement;
    String typeOfFuel;
    String power;
    String color;


    Car(String producer, String model, Integer yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }
}
