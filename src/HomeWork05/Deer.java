package HomeWork05;

public class Deer extends Beast{

    public Deer(String animalName) {
        System.out.printf(ANSI_YELLOW + "LOG_INFO: Deer 'constructor' -> " +
                "Create object Deer with name %s%n" + ANSI_RESET, animalName);
        this.animalName = animalName;
    }

    public void toShit() {
        System.out.println(ANSI_YELLOW + "LOG_INFO: Deer 'method to shit starts" + ANSI_RESET);
        System.out.println(this.animalName + ": I shit balls!");
    }

    @Override
    public String getAnimalName() {
        System.out.printf(ANSI_YELLOW + "LOG_INFO: Deer 'getter for name' -> " +
                "Get deer name - %s%n" + ANSI_RESET, this.animalName);
        return this.animalName;
    }
}
