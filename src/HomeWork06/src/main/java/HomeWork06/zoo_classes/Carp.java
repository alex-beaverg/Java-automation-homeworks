package HomeWork06.zoo_classes;

public class Carp extends Fish {

    public Carp(String animalName) {
        System.out.printf(ANSI_YELLOW + "LOG_INFO: Carp 'constructor' -> " +
                "Create object Carp with name %s%n" + ANSI_RESET, animalName);
        this.animalName = animalName;
    }

    public void toEat() {
        System.out.println(ANSI_YELLOW + "LOG_INFO: Carp 'method to eat starts" + ANSI_RESET);
        System.out.println(this.animalName + ": I eat corn!");
    }

    @Override
    public String getAnimalName() {
        System.out.printf(ANSI_YELLOW + "LOG_INFO: Carp 'getter for name' -> " +
                "Get carp name - %s%n" + ANSI_RESET, this.animalName);
        return this.animalName;
    }
}
