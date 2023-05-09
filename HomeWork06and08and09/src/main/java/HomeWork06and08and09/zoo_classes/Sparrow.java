package HomeWork06and08and09.zoo_classes;

/**
 * Class Sparrow extends class Bird
 */
public class Sparrow extends Bird {

    /**
     * Constructor for class Sparrow
     * @param animalName
     */
    public Sparrow(String animalName) {
        System.out.printf(ANSI_YELLOW + "LOG_INFO: Sparrow 'constructor' -> " +
                "Create object Sparrow with name %s%n" + ANSI_RESET, animalName);
        this.animalName = animalName;
    }

    /**
     * Method for flying sparrow
     */
    public void toFly() {
        System.out.println(ANSI_YELLOW + "LOG_INFO: Sparrow 'method to fly starts" + ANSI_RESET);
        System.out.println(this.animalName + ": I fly chaotically!");
    }

    /**
     * Override getter for sparrow name
     * @return animalName
     */
    @Override
    public String getAnimalName() {
        System.out.printf(ANSI_YELLOW + "LOG_INFO: Sparrow 'getter for name' -> " +
                "Get sparrow name - %s%n" + ANSI_RESET, this.animalName);
        return this.animalName;
    }
}
