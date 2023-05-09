package HomeWork06and08.zoo_classes;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class Zoo
 */
public class Zoo {
    // Variables for print logs in another color:
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_RESET = "\u001B[0m";

    // Zoo class variable:
    private static ArrayList<Animal> zoo;

    /**
     * Constructor for class Zoo
     */
    public Zoo() {
        System.out.println(ANSI_YELLOW + "LOG_INFO: Zoo 'constructor' -> Create object Zoo" + ANSI_RESET);
        zoo = new ArrayList<>();
    }

    /**
     * Method to add animal to zoo
     * @param animal
     */
    public void addAnimalToZoo(Animal animal) {
        System.out.printf(ANSI_YELLOW + "LOG_INFO: Zoo 'method to add animal' -> " +
                "Add animal %s to zoo %n" + ANSI_RESET, animal.getAnimalName());
        zoo.add(animal);
    }

    /**
     * Getter for zoo list
     * @return zoo
     */
    public ArrayList<Animal> getZoo() {
        System.out.println(ANSI_YELLOW + "LOG_INFO: Zoo 'getter' for zoo list starts" + ANSI_RESET);
        return zoo;
    }

    /**
     * Method to print all information about zoo
     */
    public void printAllTheZoo() {
        System.out.println(ANSI_YELLOW + "LOG_INFO: Zoo 'method to print all the zoo' -> " +
                "Print list of all animals in zoo" + ANSI_RESET);
        System.out.println("Animals in our zoo:");
        int count = 1;
        for (Animal animal : zoo) {
            System.out.println("\t" + count + ". " + animal.getAnimalName());
            count++;
        }
        System.out.print("Enter number (1-6) of animal to print exclusive information (0 -> to exit): ");
        while (true) {
            int number = new Scanner(System.in).nextInt();
            if (number == 0) {
                break;
            } else if (number < 1 || number > 6) {
                System.out.print("Enter correct number (0-6): ");
            } else {
                printExclusiveInformation(number);
                System.out.print("Enter next number (1-6) of animal to print exclusive information (0 -> to exit): ");
            }

        }
    }

    /**
     * Method to print exclusive information about chosen animal in zoo
     * @param number
     */
    private void printExclusiveInformation(int number) {
        Animal animal = zoo.get(number - 1);
        System.out.printf(ANSI_YELLOW + "LOG_INFO: Zoo 'method to print exclusive information' -> " +
                "Print exclusive information about %s%n" + ANSI_RESET, animal.getAnimalName());
        System.out.printf("Animal %s:%n", animal.getAnimalName());
        System.out.printf("\t\tBreath: %s%n", animal.toBreathe());
        System.out.printf("\t\tMovement: %s%n", animal.toMove());
    }
}
