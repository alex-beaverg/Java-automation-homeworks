/**
 * Class Main
 */
public class Main {
    /**
     * Main program entry point
     */
    public static void main(String[] args) {
        // Launch "Homework 01":
        homeWork01Launcher();
        // Launch "Homework 02":
        homeWork02Launcher();
    }

    /**
     * Function for launch Homework 01
     */
    public static void homeWork01Launcher() {
        System.out.println("\nHomework 01");
        System.out.println("-----------");
        System.out.println("LOG_INFO: Homework 01 starts");
        // Create object for "Homework 01":
        HomeWork01 homeWork01 = new HomeWork01();
        // Launch function for Task 01. Information about myself:
        homeWork01.printInformationAboutMe();
        // Launch function for Task 02. All types of variables:
        homeWork01.printAllTypesVariables();
        // Launch function for Task 03. String methods:
        homeWork01.printStringMethods();
    }

    /**
     * Function for launch Homework 02
     */
    public static void homeWork02Launcher() {
        System.out.println("\nHomework 02");
        System.out.println("-----------");
        System.out.println("LOG_INFO: Homework 02 starts");
        // Create object for "Homework 02":
        HomeWork02 homeWork02 = new HomeWork02();
        // Launch function for Task 01. Endless cycle:
        homeWork02.endlessCycle();
        // Launch function for Task 02. Cycle "for":
        homeWork02.cycleFor();
        // Launch function for Task 03. Operator "if":
        homeWork02.operatorIf();
        // Launch function for Task 04. Remote control:
        homeWork02.remoteControl();
        // Launch function for Task 05. Operator "switch":
        homeWork02.operatorSwitch();
    }
}