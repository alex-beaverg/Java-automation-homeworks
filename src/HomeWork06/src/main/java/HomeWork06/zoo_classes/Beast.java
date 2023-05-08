package HomeWork06.zoo_classes;

public class Beast extends Animal {

    @Override
    public String toBreathe() {
        System.out.println(ANSI_YELLOW + "LOG_INFO: Beast 'method to breathe starts" + ANSI_RESET);
        return "I breathe air!";
    }

    @Override
    public String toMove() {
        System.out.println(ANSI_YELLOW + "LOG_INFO: Beast 'method to move starts" + ANSI_RESET);
        return "I move on the ground!";
    }

    @Override
    public String getAnimalName() {
        return null;
    }
}
