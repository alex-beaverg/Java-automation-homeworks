package HomeWork03;

/**
 * Interface Subject
 */
public interface Subject {
    // Variables for print logs in another color:
    String ANSI_YELLOW = "\u001B[33m";
    String ANSI_RESET = "\u001B[0m";

    /**
     * Getter for Subject's field Name
     */
    String getSubjectName();

    /**
     * Method to print information about Subject
     */
    void printSubjectInformation();
}
