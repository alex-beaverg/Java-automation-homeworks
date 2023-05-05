package HomeWork05;

public class Lion extends Beast{

    public Lion(String animalName) {
        System.out.printf(ANSI_YELLOW + "LOG_INFO: Lion 'constructor' -> " +
                "Create object Lion with name %s%n" + ANSI_RESET, animalName);
        this.animalName = animalName;
    }

    public void toGrowl() {
        System.out.println(ANSI_YELLOW + "LOG_INFO: Lion 'method to growl starts" + ANSI_RESET);
        System.out.println(this.animalName + ": I roar loudly!");
    }

    @Override
    public String getAnimalName() {
        System.out.printf(ANSI_YELLOW + "LOG_INFO: Lion 'getter for name' -> " +
                "Get lion name - %s%n" + ANSI_RESET, this.animalName);
        return this.animalName;
    }
}
