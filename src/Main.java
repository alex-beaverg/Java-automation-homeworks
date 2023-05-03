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
    }

    /**
     * Function for launch Homework 01
     */
    public static void homeWork01Launcher() {
        System.out.println("\nHomework 01");
        // Create object for "Homework 01":
        HomeWork01 homeWork01 = new HomeWork01();
        // Launch method for Task 01. Information about myself:
        homeWork01.printInformationAboutMe();
        // Launch method for Task 02. All types of variables:
        homeWork01.printAllTypesVariables();
        // Launch method for Task 03. String methods:
        homeWork01.printStringMethods();
    }
}