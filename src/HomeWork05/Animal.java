package HomeWork05;

public abstract class Animal{
    // Variables for print logs in another color:
    protected static final String ANSI_YELLOW = "\u001B[33m";
    protected static final String ANSI_RESET = "\u001B[0m";

    protected String animalName;
    public abstract String toBreathe();
    public abstract String toMove();
    public abstract String getAnimalName();
}
