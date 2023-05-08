package HomeWork06.zoo_classes;

public class Pike extends Fish{

    public Pike(String animalName) {
        System.out.printf(ANSI_YELLOW + "LOG_INFO: Pike 'constructor' -> " +
                "Create object Pike with name %s%n" + ANSI_RESET, animalName);
        this.animalName = animalName;
    }

    public void toSwim() {
        System.out.println(ANSI_YELLOW + "LOG_INFO: Pike 'method to swim starts" + ANSI_RESET);
        System.out.println(this.animalName + ": I swim fast!");
    }

    @Override
    public String getAnimalName() {
        System.out.printf(ANSI_YELLOW + "LOG_INFO: Pike 'getter for name' -> " +
                "Get pike name - %s%n" + ANSI_RESET, this.animalName);
        return this.animalName;
    }
}
