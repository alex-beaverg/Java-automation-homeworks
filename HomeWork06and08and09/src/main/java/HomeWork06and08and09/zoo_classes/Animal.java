package HomeWork06and08and09.zoo_classes;

/**
 * Abstract class Animal
 */
public abstract class Animal{
    // Variables for print logs in another color:
    protected static final String ANSI_YELLOW = "\u001B[33m";
    protected static final String ANSI_RESET = "\u001B[0m";

    // Animal class variable:
    protected String animalName;

    /**
     * Abstract method for breathing animal
     */
    public abstract String toBreathe();

    /**
     * Abstract method for moving animal
     */
    public abstract String toMove();

    /**
     * Abstract getter for animal name
     */
    public abstract String getAnimalName();
}
