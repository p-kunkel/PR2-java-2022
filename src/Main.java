public class Main {
    public static void main(String[] args) {
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

        Adam.pet.feed();
        Adam.pet.takeForAWalk();
        Adam.pet.takeForAWalk();
        Adam.pet.takeForAWalk();
        Adam.pet.takeForAWalk();
        Adam.pet.feed();
        Adam.pet.takeForAWalk();
        Adam.pet.takeForAWalk();
        Adam.pet.takeForAWalk();
        Adam.pet.takeForAWalk();
        Adam.pet.takeForAWalk();
        Adam.pet.feed();
    }
}