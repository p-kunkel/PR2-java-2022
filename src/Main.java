public class Main {
    public static void main(String[] args) {
        Human Adam = new Human(1998);
        Adam.firstName = "Adam";
        Adam.firstName = "Kowalski";

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