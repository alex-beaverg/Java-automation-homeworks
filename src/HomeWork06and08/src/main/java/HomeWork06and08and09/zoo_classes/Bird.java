package HomeWork06and08.zoo_classes;

/**
 * Class Bird extends abstract class Animal
 */
public class Bird extends Animal {

    /**
     * Override method for breathing bird
     * @return "I breathe air!"
     */
    @Override
    public String toBreathe() {
        System.out.println(ANSI_YELLOW + "LOG_INFO: Bird 'method to breathe starts" + ANSI_RESET);
        return "I breathe air!";
    }

    /**
     * Override method for moving bird
     * @return "I move in the air!"
     */
    @Override
    public String toMove() {
        System.out.println(ANSI_YELLOW + "LOG_INFO: Bird 'method to move starts" + ANSI_RESET);
        return "I move in the air!";
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
