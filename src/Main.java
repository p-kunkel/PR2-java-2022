import devices.Car;
import devices.Phone;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Human Adam = new Human(1998);
        Adam.firstName = "Adam";
        Adam.lastName = "Kowalski";

        Adam.pet = new Animal("canis");
        Adam.pet.name = "George";

        Adam.phone = new Phone("Samsung", "Galaxy S20", 2020, 7.0);
        Adam.phone.operatingSystem = "Android 10";

        Adam.setSalary(10000.0); 

        Car car = new Car("Audi","A6", 2015);
        car.color = "silver";
        car.typeOfFuel = "gasoline";
        car.engineDisplacement = 1984;
        car.power = "252 KM";
        car.price = 50000.0;

        Adam.setCar(car);

        Adam.phone.turnOn();
        Adam.getCar().turnOn();

        System.out.println(Adam.phone.toString());
        System.out.println(Adam.getCar().toString());

    }
}