public class Animal {
    private static final Double DEFAULT_DOG_WEIGHT = 10.5;
    private static final Double DEFAULT_CAT_WEIGHT = 4.0;
    private static final Double DEFAULT_ELEPHANT_WEIGHT = 700.0;
    private static final Double DEFAULT_ANIMAL_WEIGHT = 1.0;

    final String species;
    String name;
    private Double weight;
    private Boolean isAlive;

    public Animal(String species) {
        this.species = species;
        this.isAlive = true;

        switch (species) {
            case "canis" : this.weight = DEFAULT_DOG_WEIGHT; break;
            case "felis" : this.weight = DEFAULT_CAT_WEIGHT; break;
            case "elephant" : this.weight = DEFAULT_ELEPHANT_WEIGHT; break;
            default : this.weight = DEFAULT_ANIMAL_WEIGHT;
        }
    }

    public void feed(){
        if (this.isAlive) {
            this.weight += 2.0;
            System.out.printf("You feed %s...\n", this.name);
        } else {
            System.out.printf("You're trying to feed a dead animal!\n", this.name);
        }
    }

    public void takeForAWalk(){
        if (this.isAlive) {
            this.weight -= 2.0;
            System.out.printf("You take %s for walk...\n", this.name);

            if (this.weight <= 0) {
                this.isAlive = false;
                System.out.printf("%s was dead. :(\n", this.name);

            } else if (this.weight - 2.0 <= 0) {
                System.out.printf("Don't forget to feed %s after walk.\n", this.name);
            }
        } else {
            System.out.printf("You're trying to take a dead animal for a walk!\n", this.name);
        }
    }
}