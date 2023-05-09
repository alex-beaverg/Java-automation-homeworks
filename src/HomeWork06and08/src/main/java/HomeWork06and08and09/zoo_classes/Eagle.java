package HomeWork06and08.zoo_classes;

/**
 * Class Eagle extends class Bird
 */
public class Eagle extends Bird{

    /**
     * Constructor for class Eagle
     * @param animalName
     */
    public Eagle(String animalName) {
        System.out.printf(ANSI_YELLOW + "LOG_INFO: Eagle 'constructor' -> " +
                "Create object Eagle with name %s%n" + ANSI_RESET, animalName);
        this.animalName = animalName;
    }

    /**
     * Method for sleeping eagle
     */
    public void toSleep() {
        System.out.println(ANSI_YELLOW + "LOG_INFO: Eagle 'method to sleep starts" + ANSI_RESET);
        System.out.println(this.animalName + ": I sleep standing up!");
    }

    /**
     * Override getter for eagle name
     * @return animalName
     */
    @Override
    public String getAnimalName() {
        System.out.printf(ANSI_YELLOW + "LOG_INFO: Eagle 'getter for name' -> " +
                "Get eagle name - %s%n" + ANSI_RESET, this.animalName);
        return this.animalName;
    }
}
