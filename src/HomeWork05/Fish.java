package HomeWork05;

public class Fish extends Animal {

    @Override
    public String toBreathe() {
        System.out.println(ANSI_YELLOW + "LOG_INFO: Fish 'method to breathe starts" + ANSI_RESET);
        return "I breathe water!";
    }

    @Override
    public String toMove() {
        System.out.println(ANSI_YELLOW + "LOG_INFO: Fish 'method to move starts" + ANSI_RESET);
        return "I move in the water!";
    }

    @Override
    public String getAnimalName() {
        return null;
    }
}
