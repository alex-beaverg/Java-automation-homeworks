import java.util.Arrays;
import java.util.Scanner;

/**
 * Class HomeWork01
 */
public class HomeWork01 {
    /**
     * Function for print information about me
     */
    public void printInformationAboutMe() {
        System.out.println("\nTask 1. Information about myself");
        System.out.println("------");
        System.out.println("LOG_INFO: Print information about me");
        String name = "Alexey";
        String surname = "Bobrikov";
        String patronymic = "Valerievich";
        String fullName = String.format("%s %s %s", surname, name, patronymic);
        String surnameWithInitials = String.format("%s %s.%s.", surname, name.charAt(0), patronymic.charAt(0));
        System.out.println(fullName + " (" + surnameWithInitials + ")");
    }

    /**
     * Function for print all types variables
     */
    public void printAllTypesVariables() {
        System.out.println("\nTask 2. All types of variables");
        System.out.println("------");
        System.out.println("LOG_INFO: Print all types variables");
        byte a = 100;
        short b = 1000;
        int c = 10000;
        long d = 100000;
        float e = 10.25f;
        double f = 10.47;
        boolean g = true;
        char h = 'X';
        String i = "Hello World!";
        System.out.printf("%-40s %s%n", "byte (byte a = 100):", a);
        System.out.printf("%-40s %s%n", "short (short b = 1000):", b);
        System.out.printf("%-40s %s%n", "int (int c = 10000):", c);
        System.out.printf("%-40s %s%n", "long (long d = 100000):", d);
        System.out.printf("%-40s %s%n", "float (float e = 10.25f):", e);
        System.out.printf("%-40s %s%n", "double (double f = 10.47):", f);
        System.out.printf("%-40s %s%n", "boolean (boolean g = true):", g);
        System.out.printf("%-40s %s%n", "char (char h = 'X'):", h);
        System.out.printf("%-40s %s%n", "String (String i = \"Hello World!\"):", i);
    }

    /**
     * Function for print results of string methods
     */
    public void printStringMethods() {
        System.out.println("\nTask 3. String methods");
        System.out.println("------");
        System.out.println("LOG_INFO: Print String methods");
        System.out.print("Enter your text, for example 'Hello world!!!': ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.printf("%-40s %s%n", "text.toUpperCase():", text.toUpperCase());
        System.out.printf("%-40s %s%n", "text.toLowerCase():", text.toLowerCase());
        System.out.printf("%-40s %s%n", "text.length():", text.length());
        System.out.printf("%-40s %s%n", "text.toCharArray():", Arrays.toString(text.toCharArray()));
        System.out.printf("%-40s %s%n", "text.isEmpty():", text.isEmpty());
        System.out.printf("%-40s %s%n", "text.concat(\" Hi!\"):", text.concat(" Hi!"));
        System.out.printf("%-40s %s%n", "String.join(\"-\", text, \"Hi!!!\"):", String.join("-", text, "Hi!!!"));
        System.out.printf("%-40s %s%n", "text.compareTo(\"Hi!\"):", text.compareTo("Hi!"));
        System.out.printf("%-40s %s%n", "text.charAt(0):", text.charAt(0));
        System.out.printf("%-40s %s%n", "text.equals(\"Hi!\"):", text.equals("Hi!"));
        System.out.printf("%-40s %s%n", "text.equalsIgnoreCase(\"Hi!\"):", text.equalsIgnoreCase("Hi!"));
        System.out.printf("%-40s %s%n", "text.indexOf(\"world\"):", text.indexOf("world"));
        System.out.printf("%-40s %s%n", "text.lastIndexOf(\"!\"):", text.lastIndexOf("!"));
        System.out.printf("%-40s %s%n", "text.startsWith(\"Hello\"):", text.startsWith("Hello"));
        System.out.printf("%-40s %s%n", "text.endsWith(\"!!!\"):", text.endsWith("???"));
        System.out.printf("%-40s %s%n", "text.replace(\"o\", \"AAA\"):", text.replace("o", "AAA"));
        System.out.printf("%-40s %s%n", "text.trim():", text.trim());
        System.out.printf("%-40s %s%n", "text.trim():", text.substring(0,5));
    }
}