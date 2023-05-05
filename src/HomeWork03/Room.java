package HomeWork03;

import java.util.ArrayList;

/**
 * Class Room
 */
public class Room {
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_RESET = "\u001B[0m";
    private String roomName;
    private int roomLength;
    private int roomWidth;
    private int roomHeight;
    private ArrayList<Subject> subjects;

    /**
     * Constructor for class Room
     */
    public Room(String roomName, int roomLength, int roomWidth, int roomHeight) {
        System.out.println(ANSI_YELLOW + "LOG_INFO: Room 'constructor' -> Create object Room" + ANSI_RESET);
        this.roomName = roomName;
        this.roomLength = roomLength;
        this.roomWidth = roomWidth;
        this.roomHeight = roomHeight;
        this.subjects = new ArrayList<>();
    }

    /**
     * Method to add subjects into the room
     */
    public void addSubjectToRoom(Subject subject) {
        System.out.printf(ANSI_YELLOW + "LOG_INFO: Room 'add to room method' -> " +
                "Add subject %s to Room%n" + ANSI_RESET, subject.getSubjectName());
        this.subjects.add(subject);
    }

    /**
     * Method to print Room information
     */
    public void printRoomInformation() {
        System.out.printf(ANSI_YELLOW + "LOG_INFO: Room 'method to print information' -> " +
                "Print information about %s%n" + ANSI_RESET, this.roomName);
        System.out.println("My room:");
        System.out.printf("\tName: %s%n", this.roomName);
        System.out.printf("\tLength: %s m %n", this.roomLength);
        System.out.printf("\tWidth: %s m %n", this.roomWidth);
        System.out.printf("\tHeight: %s m %n", this.roomHeight);
        System.out.println("\tSubjects in my room:");
        for (Subject item : this.subjects) {
            System.out.printf("\t\tSubject %s%n", item.getSubjectName());
        }
    }
}
