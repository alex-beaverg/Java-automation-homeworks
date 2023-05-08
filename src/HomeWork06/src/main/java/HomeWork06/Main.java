package HomeWork06;

import HomeWork06.zoo_classes.*;

/*
mvn clean compile
mvn package
java -jar "D:\Code\JAVA\Java-automation-project\src\HomeWork06\target\HomeWork06-1.0-SNAPSHOT.jar"
mvn clean
*/

/**
 * Class Main
 */
public class Main {
    // Variables for print logs in another color:
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_RESET = "\u001B[0m";

    /**
     * Main program entry point
     */
    public static void main(String[] args) {
        // Launch "HomeWork 06":
        homeWork06Launcher();
    }

    /**
     * Function for launch Homework 06
     */
    public static void homeWork06Launcher() {
        System.out.println("\nHomework 06");
        System.out.println("-----------");
        System.out.println(ANSI_YELLOW + "LOG_INFO: Homework 06 starts" + ANSI_RESET);

        // Actions for "HomeWork 06":
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