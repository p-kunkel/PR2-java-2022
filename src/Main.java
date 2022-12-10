public class Main {
    public static void main(String[] args) throws InterruptedException {
        Human Adam = new Human(1998);
        Adam.firstName = "Adam";
        Adam.lastName = "Kowalski";

        Adam.car = new Car("Audi","A6", 2015);
        Adam.car.color = "silver";
        Adam.car.typeOfFuel = "gasoline";
        Adam.car.engineDisplacement = 1984;
        Adam.car.power = "252 KM";

        Adam.pet = new Animal("canis");
        Adam.pet.name = "George";

        Double salary = Adam.getSalary();
        System.out.printf("salary: %s\n",salary);
        Adam.setSalary(1000.0); 
        Adam.getSalary();
        Adam.setSalary(-1000.0); 
        Adam.getSalary();
        Adam.setSalary(2000.0); 
        salary = Adam.getSalary();
        System.out.printf("salary: %s\n",salary);
    }
}