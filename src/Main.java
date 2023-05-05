import HomeWork03.Bed;
import HomeWork03.Room;
import HomeWork03.Table;
import HomeWork03.Wardrobe;

/**
 * Class Main
 */
public class Main {
    /**
     * Main program entry point
     */
    // Variables for print logs in another color:
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        // Launch "Homework 01":
//        homeWork01Launcher();

        // Launch "Homework 02":
//        homeWork02Launcher();

        // Launch "Homework 02. Additional tasks":
//        homeWork02AdditionalTasksLauncher();

        // Launch "HomeWork 03":
//        homeWork03Launcher();
    }

    /**
     * Function for launch Homework 01
     */
    public static void homeWork01Launcher() {
        System.out.println("\nHomework 01");
        System.out.println("-----------");
        System.out.println(ANSI_YELLOW + "LOG_INFO: Homework 01 starts" + ANSI_RESET);

        // Create object for "Homework 01":
        HomeWork01 homeWork01 = new HomeWork01();

        // Launch function for Task 1. Information about myself:
        homeWork01.printInformationAboutMe();

        // Launch function for Task 2. All types of variables:
        homeWork01.printAllTypesVariables();

        // Launch function for Task 3. String methods:
        homeWork01.printStringMethods();
    }

    /**
     * Function for launch Homework 02
     */
    public static void homeWork02Launcher() {
        System.out.println("\nHomework 02");
        System.out.println("-----------");
        System.out.println(ANSI_YELLOW + "LOG_INFO: Homework 02 starts" + ANSI_RESET);

        // Create object for "Homework 02":
        HomeWork02 homeWork02 = new HomeWork02();

        // Launch function for Task 1. Endless cycle:
        homeWork02.endlessCycle();

        // Launch function for Task 2. Cycle "for":
        homeWork02.cycleFor();

        // Launch function for Task 3. Operator "if":
        homeWork02.operatorIf();

        // Launch function for Task 4. Remote control:
        homeWork02.remoteControl();

        // Launch function for Task 5. Operator "switch":
        homeWork02.operatorSwitch();
    }

    /**
     * Function for launch Homework 02. Additional tasks
     */
    public static void homeWork02AdditionalTasksLauncher() {
        System.out.println("\nHomework 02. Additional tasks");
        System.out.println("-----------");
        System.out.println(ANSI_YELLOW + "LOG_INFO: Homework 02. Additional tasks starts" + ANSI_RESET);

        // Create object for "Homework 02. Additional tasks":
        HomeWork02AdditionalTasks homeWork02AdditionalTasks = new HomeWork02AdditionalTasks();

        // Launch function for Task 1. Operator "if" actions:
        homeWork02AdditionalTasks.operatorIfActions();

        // Launch function for Task 2. Cycle actions:
        homeWork02AdditionalTasks.cycleActions();

        // Launch function for Task 3. Array actions:
        homeWork02AdditionalTasks.arrayActions();
    }

    /**
     * Function for launch Homework 03
     */
    public static void homeWork03Launcher() {
        System.out.println("\nHomework 03");
        System.out.println("-----------");
        System.out.println(ANSI_YELLOW + "LOG_INFO: Homework 03 starts" + ANSI_RESET);

        // Actions for "HomeWork 03":
        Room myRoom = new Room("'Bedroom'", 8, 5, 3);
        Table myTable = new Table("'Work desk'", 1.5, 1, 0.8);
        myRoom.addSubjectToRoom(myTable);
        Bed myBed = new Bed("'Double bed'", 200, 160, 50);
        myRoom.addSubjectToRoom(myBed);
        Wardrobe myWardrobe = new Wardrobe("'Full wall wardrobe'", 0.7, 5, 3);
        myRoom.addSubjectToRoom(myWardrobe);

        // Print information:
        myTable.printSubjectInformation();
        myBed.printSubjectInformation();
        myWardrobe.printSubjectInformation();
        myRoom.printRoomInformation();
    }
}