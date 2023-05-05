package HomeWork03and04;

/**
 * Class Bed implements interface Subject
 */
public class Bed implements Subject {
    private final String bedName;
    private final int bedLength;
    private final int bedWidth;
    private final int bedHeight;

    /**
     * Constructor for class Bed
     */
    public Bed(String bedName, int bedLength, int bedWidth, int bedHeight) {
        System.out.printf(ANSI_YELLOW + "LOG_INFO: Bed 'constructor' -> " +
                "Create object Bed with name %s%n" + ANSI_RESET, bedName);
        this.bedName = bedName;
        this.bedLength = bedLength;
        this.bedWidth = bedWidth;
        this.bedHeight = bedHeight;
    }

    /**
     * Override getter for field bedName
     */
    @Override
    public String getSubjectName() {
        System.out.printf(ANSI_YELLOW + "LOG_INFO: Subject 'getter' -> " +
                "Get Bed name. Value = %s%n" + ANSI_RESET, this.bedName);
        return this.bedName;
    }

    /**
     * Override method to print Bed information
     */
    @Override
    public void printSubjectInformation() {
        System.out.printf(ANSI_YELLOW + "LOG_INFO: Subject 'method to print information' -> " +
                "Print information about %s%n" + ANSI_RESET, this.bedName);
        System.out.println("Bed in room:");
        System.out.printf("\tName: %s%n", this.bedName);
        System.out.printf("\tLength: %s m %n", this.bedLength);
        System.out.printf("\tWidth: %s m %n", this.bedWidth);
        System.out.printf("\tHeight: %s m %n", this.bedHeight);
    }
}
