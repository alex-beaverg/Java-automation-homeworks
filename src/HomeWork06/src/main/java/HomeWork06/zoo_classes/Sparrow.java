package HomeWork06.zoo_classes;

public class Sparrow extends Bird {

    public Sparrow(String animalName) {
        System.out.printf(ANSI_YELLOW + "LOG_INFO: Sparrow 'constructor' -> " +
                "Create object Sparrow with name %s%n" + ANSI_RESET, animalName);
        this.animalName = animalName;
    }

    public void toFly() {
        System.out.println(ANSI_YELLOW + "LOG_INFO: Sparrow 'method to fly starts" + ANSI_RESET);
        System.out.println(this.animalName + ": I fly chaotically!");
    }

    @Override
    public String getAnimalName() {
        System.out.printf(ANSI_YELLOW + "LOG_INFO: Sparrow 'getter for name' -> " +
                "Get sparrow name - %s%n" + ANSI_RESET, this.animalName);
        return this.animalName;
    }
}
