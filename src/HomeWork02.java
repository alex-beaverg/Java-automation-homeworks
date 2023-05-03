import java.util.Scanner;

/**
 * Class HomeWork02
 */
public class HomeWork02 {
    /**
     * Function for endless cycle
     */
    public void endlessCycle() {
        System.out.println("\nTask 1. Endless cycle");
        System.out.println("------");
        System.out.println("LOG_INFO: Endless cycle function starts");

        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (true) {
            System.out.print("Please enter something (enter Exit to exit from cycle): ");
            input = scanner.nextLine();
            if (input.equals("Exit")) {
                break;
            }
        }
        System.out.println("LOG_INFO: Task 1 was done!");
    }

    /**
     * Function for cycle "for"
     */
    public void cycleFor() {
        System.out.println("\nTask 2. Cycle \"for\"");
        System.out.println("------");
        System.out.println("LOG_INFO: Cycle \"for\" function starts");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int x = scanner.nextInt();
        while (true) {
            if (x >= 0) {
                break;
            } else {
                System.out.print("Please enter a positive number: ");
                x = scanner.nextInt();
            }
        }
        int sum = 0;
        for(int i = 0; i <= x; i++) {
            sum += i;
        }
        System.out.printf("The sum of all numbers from 0 to %d is %d%n", x, sum);
    }

    /**
     * Function for operator "if"
     */
    public void operatorIf() {
        System.out.println("\nTask 3. Operator \"if\"");
        System.out.println("------");
        System.out.println("LOG_INFO: Operator \"if\" function starts");

        System.out.print("Please enter your score: ");
        int score = new Scanner(System.in).nextInt();
        while (true) {
            if (score > 100 || score < 0) {
                System.out.print("Please enter correct score (0-100): ");
                score = new Scanner(System.in).nextInt();
            } else {
                break;
            }
        }
        if (score >= 70) {
            System.out.println("Congrats! You passed the test!");
        } else {
            System.out.println("Sorry, you failed the test.");
        }
    }

    /**
     * Function for remote control
     */
    public void remoteControl() {
        System.out.println("\nTask 4. Remote control");
        System.out.println("------");
        System.out.println("LOG_INFO: Remote control function starts");

        String[] channels = {
                "National geographic",
                "MTV",
                "EuroSport",
                "EuroNews",
                "CNN",
                "BBC",
                "CBS plus",
                "Animal planet",
                "CNN international",
                "American sport"
        };
        System.out.print("Please enter channel (0 to exit): ");
        int channel = new Scanner(System.in).nextInt();
        while (true) {
            if (channel == 0) {
                break;
            } else if (channel > 10 || channel < 0) {
                System.out.print("Please enter correct channel (1-10) (0 to exit): ");
                channel = new Scanner(System.in).nextInt();
            } else {
                System.out.println(channels[channel - 1]);
                System.out.print("Please enter channel (0 to exit): ");
                channel = new Scanner(System.in).nextInt();
            }
        }
        System.out.println("LOG_INFO: Task 4 was done");
    }

    /**
     * Function for operator "switch"
     */
    public void operatorSwitch() {
        System.out.println("\nTask 5. Operator \"switch\"");
        System.out.println("------");
        System.out.println("LOG_INFO: Operator \"switch\" function starts");

        String name = null;
        String surname = null;
        String age = null;
        System.out.println("1 - Enter your name");
        System.out.println("2 - Enter your surname");
        System.out.println("3 - Enter your age");
        System.out.println("4 - Print entering information");
        System.out.println("0 - Exit");
        System.out.print("\nEnter number: ");
        int number = new Scanner(System.in).nextInt();
        while (true) {
            if (number == 0) {
                break;
            } else if (number < 0 || number > 4) {
                System.out.print("Enter correct number (0-4): ");
                number = new Scanner(System.in).nextInt();
            } else {
                switch (number) {
                    case 1 -> {
                        System.out.print("Enter your name: ");
                        name = new Scanner(System.in).nextLine();
                        System.out.print("\nEnter next number: ");
                        number = new Scanner(System.in).nextInt();
                    }
                    case 2 -> {
                        System.out.print("Enter your surname: ");
                        surname = new Scanner(System.in).nextLine();
                        System.out.print("\nEnter next number: ");
                        number = new Scanner(System.in).nextInt();
                    }
                    case 3 -> {
                        System.out.print("Enter your age: ");
                        age = new Scanner(System.in).nextLine();
                        System.out.print("\nEnter next number: ");
                        number = new Scanner(System.in).nextInt();
                    }
                    case 4 -> {
                        System.out.println("\nAll information about myself:");
                        System.out.printf("Your name: %s%n", name);
                        System.out.printf("Your surname: %s%n", surname);
                        System.out.printf("Your age: %s%n", age);
                        System.out.print("\nEnter next number: ");
                        number = new Scanner(System.in).nextInt();
                    }
                }
            }
        }
        System.out.println("LOG_INFO: Task 5 was done");
    }
}
