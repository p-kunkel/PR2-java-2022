import creatures.Animal;
import creatures.Human;
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

        Human Wojtek = new Human(2000);
        Wojtek.firstName = "Wojtek";
        Wojtek.lastName = "Nowak";

        
        System.out.println(Wojtek.getCar());
        System.out.println(Adam.getCar());

        Wojtek.setSalary(1000.0);
        Wojtek.goToWork();
        Adam.getCar().sell(Adam, Wojtek, 1500.0);

        Wojtek.goToWork();
        Adam.getCar().sell(Adam, Wojtek, 1500.0);
        Adam.getCash();
        Wojtek.getCash();

        System.out.println(Wojtek.getCar());
        System.out.println(Adam.getCar());

        Adam.pet.sell(Adam, Wojtek, 400.0);
        System.out.println(Wojtek.pet);
        System.out.println(Adam.pet);

        Adam.phone.sell(Adam, Wojtek, 800.0);
        Wojtek.goToWork();
        Adam.phone.sell(Adam, Wojtek, 800.0);
        System.out.println(Wojtek.phone);
        System.out.println(Adam.phone);
        Adam.getCash();

        Adam.sell(Adam, Wojtek, 5.0);
    }
}