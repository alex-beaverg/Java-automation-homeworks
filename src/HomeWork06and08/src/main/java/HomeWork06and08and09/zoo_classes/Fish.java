package HomeWork06and08.zoo_classes;

/**
 * Class Fish extends abstract class Animal
 */
public class Fish extends Animal {

    /**
     * Override method for breathing fish
     * @return "I breathe water!"
     */
    @Override
    public String toBreathe() {
        System.out.println(ANSI_YELLOW + "LOG_INFO: Fish 'method to breathe starts" + ANSI_RESET);
        return "I breathe water!";
    }

    /**
     * Override method for moving fish
     * @return "I move in the water!"
     */
    @Override
    public String toMove() {
        System.out.println(ANSI_YELLOW + "LOG_INFO: Fish 'method to move starts" + ANSI_RESET);
        return "I move in the water!";
    }

    /**
     * Override getter for animal name
     * @return null
     */
    @Override
    public String getAnimalName() {
        return null;
    }
}
