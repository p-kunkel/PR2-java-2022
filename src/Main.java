public class Main {
    public static void main(String[] args) throws InterruptedException {
        Human Adam = new Human(1998);
        Adam.firstName = "Adam";
        Adam.lastName = "Kowalski";

        Adam.pet = new Animal("canis");
        Adam.pet.name = "George";

        Adam.setSalary(1000.0); 

        Car car = new Car("Audi","A6", 2015);
        car.color = "silver";
        car.typeOfFuel = "gasoline";
        car.engineDisplacement = 1984;
        car.power = "252 KM";
        car.price = 50000.0;

        Adam.setCar(car);

        Adam.setSalary(10000.0); 
        Adam.setCar(car);

        Adam.setSalary(50000.0); 
        Adam.setCar(car);
    }
}