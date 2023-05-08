package HomeWork06.zoo_classes;

public class Bird extends Animal {

    @Override
    public String toBreathe() {
        System.out.println(ANSI_YELLOW + "LOG_INFO: Bird 'method to breathe starts" + ANSI_RESET);
        return "I breathe air!";
    }

    @Override
    public String toMove() {
        System.out.println(ANSI_YELLOW + "LOG_INFO: Bird 'method to move starts" + ANSI_RESET);
        return "I move in the air!";
    }

    @Override
    public String getAnimalName() {
        return null;
    }
}
