package HomeWork03;

/**
 * Class Table implements interface Subject
 */
public class Table implements Subject {
    private String tableName;
    private double tableLength;
    private double tableWidth;
    private double tableHeight;

    /**
     * Constructor for class Table
     */
    public Table(String tableName, double tableLength, double tableWidth, double tableHeight) {
        System.out.printf(ANSI_YELLOW + "LOG_INFO: Table 'constructor' -> " +
                "Create object Table with name %s%n" + ANSI_RESET, tableName);
        this.tableName = tableName;
        this.tableLength = tableLength;
        this.tableWidth = tableWidth;
        this.tableHeight = tableHeight;
    }

    /**
     * Override getter for field tableName
     */
    @Override
    public String getSubjectName() {
        System.out.printf(ANSI_YELLOW + "LOG_INFO: Subject 'getter' -> " +
                "Get Table name. Value = %s%n" + ANSI_RESET, this.tableName);
        return this.tableName;
    }

    /**
     * Override method to print Table information
     */
    @Override
    public void printSubjectInformation() {
        System.out.printf(ANSI_YELLOW + "LOG_INFO: Subject 'method to print information' -> " +
                "Print information about %s%n" + ANSI_RESET, this.tableName);
        System.out.println("Table in room:");
        System.out.printf("\tName: %s%n", this.tableName);
        System.out.printf("\tLength: %s m %n", this.tableLength);
        System.out.printf("\tWidth: %s m %n", this.tableWidth);
        System.out.printf("\tHeight: %s m %n", this.tableHeight);
    }
}
