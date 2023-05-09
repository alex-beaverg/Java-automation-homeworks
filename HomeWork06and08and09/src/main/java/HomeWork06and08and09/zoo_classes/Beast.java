package HomeWork06and08and09.zoo_classes;

/**
 * Class Beast extends abstract class Animal
 */
public class Beast extends Animal {

    /**
     * Override method for breathing beast
     * @return "I breathe air!"
     */
    @Override
    public String toBreathe() {
        System.out.println(ANSI_YELLOW + "LOG_INFO: Beast 'method to breathe starts" + ANSI_RESET);
        return "I breathe air!";
    }

    /**
     * Override method for moving beast
     * @return "I move on the ground!"
     */
    @Override
    public String toMove() {
        System.out.println(ANSI_YELLOW + "LOG_INFO: Beast 'method to move starts" + ANSI_RESET);
        return "I move on the ground!";
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
