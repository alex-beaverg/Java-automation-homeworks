package HomeWork03;

/**
 * Class Wardrobe implements interface Subject
 */
public class Wardrobe implements Subject {
    private String wardrobeName;
    private double wardrobeLength;
    private double wardrobeWidth;
    private double wardrobeHeight;

    /**
     * Constructor for class Wardrobe
     */
    public Wardrobe(String wardrobeName, double wardrobeLength, double wardrobeWidth, double wardrobeHeight) {
        System.out.printf(ANSI_YELLOW + "LOG_INFO: Wardrobe 'constructor' -> " +
                "Create object Wardrobe with name %s%n" + ANSI_RESET, wardrobeName);
        this.wardrobeName = wardrobeName;
        this.wardrobeLength = wardrobeLength;
        this.wardrobeWidth = wardrobeWidth;
        this.wardrobeHeight = wardrobeHeight;
    }

    /**
     * Override getter for field wardrobeName
     */
    @Override
    public String getSubjectName() {
        System.out.printf(ANSI_YELLOW + "LOG_INFO: Subject 'getter' -> " +
                "Get Wardrobe name. Value = %s%n" + ANSI_RESET, this.wardrobeName);
        return this.wardrobeName;
    }

    /**
     * Override method to print Wardrobe information
     */
    @Override
    public void printSubjectInformation() {
        System.out.printf(ANSI_YELLOW + "LOG_INFO: Subject 'method to print information' -> " +
                "Print information about %s%n" + ANSI_RESET, this.wardrobeName);
        System.out.println("Wardrobe in room:");
        System.out.printf("\tName: %s%n", this.wardrobeName);
        System.out.printf("\tLength: %s m %n", this.wardrobeLength);
        System.out.printf("\tWidth: %s m %n", this.wardrobeWidth);
        System.out.printf("\tHeight: %s m %n", this.wardrobeHeight);
    }
}
