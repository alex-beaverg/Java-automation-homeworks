package HomeWork06.zoo_classes;

public class Eagle extends Bird{

    public Eagle(String animalName) {
        System.out.printf(ANSI_YELLOW + "LOG_INFO: Eagle 'constructor' -> " +
                "Create object Eagle with name %s%n" + ANSI_RESET, animalName);
        this.animalName = animalName;
    }

    public void toSleep() {
        System.out.println(ANSI_YELLOW + "LOG_INFO: Eagle 'method to sleep starts" + ANSI_RESET);
        System.out.println(this.animalName + ": I sleep standing up!");
    }

    @Override
    public String getAnimalName() {
        System.out.printf(ANSI_YELLOW + "LOG_INFO: Eagle 'getter for name' -> " +
                "Get eagle name - %s%n" + ANSI_RESET, this.animalName);
        return this.animalName;
    }
}
