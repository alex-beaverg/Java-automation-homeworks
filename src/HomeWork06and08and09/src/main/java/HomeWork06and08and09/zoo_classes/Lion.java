package HomeWork06and08and09.zoo_classes;

/**
 * Class Lion extends class Beast
 */
public class Lion extends Beast{

    /**
     * Constructor for class Lion
     * @param animalName
     */
    public Lion(String animalName) {
        System.out.printf(ANSI_YELLOW + "LOG_INFO: Lion 'constructor' -> " +
                "Create object Lion with name %s%n" + ANSI_RESET, animalName);
        this.animalName = animalName;
    }

    /**
     * Method for growling lion
     */
    public void toGrowl() {
        System.out.println(ANSI_YELLOW + "LOG_INFO: Lion 'method to growl' starts" + ANSI_RESET);
        System.out.println(this.animalName + ": I roar loudly!");
    }

    /**
     * Override getter for lion name
     * @return animalName
     */
    @Override
    public String getAnimalName() {
        System.out.printf(ANSI_YELLOW + "LOG_INFO: Lion 'getter for name' -> " +
                "Get lion name - %s%n" + ANSI_RESET, this.animalName);
        return this.animalName;
    }
}
