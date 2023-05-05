import HomeWork03and04.*;
import HomeWork05.*;

import java.util.Scanner;

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
        homeWork01Launcher();

        // Launch "Homework 02":
        homeWork02Launcher();

        // Launch "Homework 02. Additional tasks":
        homeWork02AdditionalTasksLauncher();

        // Launch "HomeWork 03 and 04":
        homeWork03and04Launcher();

        // Launch "HomeWork 05":
        homeWork05Launcher();
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
     * Function for launch Homework 03 and 04
     */
    public static void homeWork03and04Launcher() {
        System.out.println("\nHomework 03 and 04");
        System.out.println("-----------");
        System.out.println(ANSI_YELLOW + "LOG_INFO: Homework 03 and 04 starts" + ANSI_RESET);

        // Actions for "HomeWork 03 and 04":
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

        // Additional actions
        System.out.print("The wardrobe depth is too small. Enter the new one: ");
        double newWardrobeDepth = Double.parseDouble(new Scanner(System.in).nextLine());
        myWardrobe.setWardrobeDepth(newWardrobeDepth);
        myWardrobe.printSubjectInformation();
    }

    /**
     * Function for launch Homework 05
     */
    public static void homeWork05Launcher() {
        System.out.println("\nHomework 05");
        System.out.println("-----------");
        System.out.println(ANSI_YELLOW + "LOG_INFO: Homework 05 starts" + ANSI_RESET);

        // Actions for "HomeWork 05":
        Zoo zoo = new Zoo();
        Lion lion = new Lion("Lion Alex");
        zoo.addAnimalToZoo(lion);
        Deer deer = new Deer("Deer Valera");
        zoo.addAnimalToZoo(deer);
        Eagle eagle = new Eagle("Eagle Steeve");
        zoo.addAnimalToZoo(eagle);
        Sparrow sparrow = new Sparrow("Sparrow Jack");
        zoo.addAnimalToZoo(sparrow);
        Pike pike = new Pike("Pike Arrow");
        zoo.addAnimalToZoo(pike);
        Carp carp = new Carp("Carp Anton");
        zoo.addAnimalToZoo(carp);

        // Print information
        lion.toGrowl();
        deer.toShit();
        eagle.toSleep();
        sparrow.toFly();
        pike.toSwim();
        carp.toEat();
        zoo.printAllTheZoo();
    }
}