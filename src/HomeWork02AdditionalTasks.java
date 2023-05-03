import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Class HomeWork02AdditionalTasks
 */
public class HomeWork02AdditionalTasks {
    /**
     * Function for operator "if" actions
     */
    public void operatorIfActions() {
        System.out.println("\nTask 1. Operator \"if\" actions");
        System.out.println("------");
        System.out.println("LOG_INFO: Operator \"if\" actions function starts");

        // Task 1.1
        System.out.println("\n1.1 Greater than 10?");
        System.out.print("Enter any number: ");
        int number = new Scanner(System.in).nextInt();
        if (number > 10) {
            System.out.println("The number is greater than 10");
        } else if (number == 10) {
            System.out.println("The number is 10");
        } else {
            System.out.println("The number is less than 10");
        }

        // Task 1.2
        System.out.println("\n1.2 What is greater?");
        System.out.print("Enter the first number: ");
        int num1 = new Scanner(System.in).nextInt();
        System.out.print("Enter the second number: ");
        int num2 = new Scanner(System.in).nextInt();
        if (num1 > num2) {
            System.out.println("The first number is greater than the second number");
        } else if (num1 < num2) {
            System.out.println("The second number is greater than the first number");
        } else {
            System.out.println("The first number is the second number");
        }

        // Task 1.3
        System.out.println("\n1.3 What kind of triangle?");
        System.out.print("Enter the first side of triangle: ");
        int a = new Scanner(System.in).nextInt();
        while (a < 0) {
            System.out.print("Enter the correct first side of triangle (a > 0): ");
            a = new Scanner(System.in).nextInt();
        }
        System.out.print("Enter the second side of triangle: ");
        int b = new Scanner(System.in).nextInt();
        while (b < 0) {
            System.out.print("Enter the correct second side of triangle (b > 0): ");
            b = new Scanner(System.in).nextInt();
        }
        System.out.print("Enter the third side of triangle: ");
        int c = new Scanner(System.in).nextInt();
        while (c < 0) {
            System.out.print("Enter the correct third side of triangle (c > 0): ");
            c = new Scanner(System.in).nextInt();
        }
        if (a == b && b == c) {
            System.out.println("The triangle is equilateral");
        } else if (a == b || b == c || c == a) {
            System.out.println("The triangle is isosceles");
        } else {
            System.out.println("The triangle is scalene");
        }

        // Task 1.4
        System.out.println("\n1.4 Numbers of positive and negative numbers");
        System.out.print("Enter the first number: ");
        int n1 = new Scanner(System.in).nextInt();
        System.out.print("Enter the second number: ");
        int n2 = new Scanner(System.in).nextInt();
        System.out.print("Enter the third number: ");
        int n3 = new Scanner(System.in).nextInt();
        System.out.print("Enter the fourth number: ");
        int n4 = new Scanner(System.in).nextInt();
        int[] numbers = { n1, n2, n3, n4 };
        int positive_count = 0;
        int negative_count = 0;
        int zero_count = 0;
        for(int num : numbers) {
            if (num > 0) {
                positive_count += 1;
            } else if (num < 0) {
                negative_count += 1;
            } else {
                zero_count += 1;
            }
        }
        System.out.printf("Number of positive numbers: %d%n", positive_count);
        System.out.printf("Number of negative numbers: %d%n", negative_count);
        System.out.printf("Number of zeros: %d%n", zero_count);

        // Task 1.5
        System.out.println("\n1.5 Maximum number");
        System.out.print("Enter the first number: ");
        int nu1 = new Scanner(System.in).nextInt();
        System.out.print("Enter the second number: ");
        int nu2 = new Scanner(System.in).nextInt();
        System.out.print("Enter the third number: ");
        int nu3 = new Scanner(System.in).nextInt();
        if (nu1 > nu2) {
            System.out.printf("Maximum number: %d%n", Math.max(nu1, nu3));
        } else {
            System.out.printf("Maximum number: %d%n", Math.max(nu2, nu3));
        }

        // Task 1.6
        System.out.println("\n1.6 Maximum and minimum numbers");
        System.out.print("Enter the first number: ");
        int numb1 = new Scanner(System.in).nextInt();
        System.out.print("Enter the second number: ");
        int numb2 = new Scanner(System.in).nextInt();
        System.out.print("Enter the third number: ");
        int numb3 = new Scanner(System.in).nextInt();
        if (numb1 > numb2) {
            System.out.printf("Maximum number: %d%n", Math.max(numb1, numb3));
        } else {
            System.out.printf("Maximum number: %d%n", Math.max(numb2, numb3));
        }
        if (numb1 < numb2) {
            System.out.printf("Minimum number: %d%n", Math.min(numb1, numb3));
        } else {
            System.out.printf("Minimum number: %d%n", Math.min(numb2, numb3));
        }

        // Task 1.7
        System.out.println("\n1.7 Even or odd?");
        System.out.print("Enter the number: ");
        int k = new Scanner(System.in).nextInt();
        if (k % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }

        // Task 1.8
        System.out.println("\n1.8 Food market");
        System.out.println("Choose the good:");
        System.out.println("1 - Milk, 3 BYN");
        System.out.println("2 - Tomato, 8 BYN");
        System.out.println("3 - Meat, 15 BYN");
        System.out.print("Enter the number of good: ");
        int x = new Scanner(System.in).nextInt();
        while (x < 1 || x > 3) {
            System.out.print("Enter the correct number of good: ");
            x = new Scanner(System.in).nextInt();
        }
        System.out.print("How much money do you have: ");
        int money = new Scanner(System.in).nextInt();
        int cost = 0;
        switch (x) {
            case 1 -> cost = 3;
            case 2 -> cost = 8;
            case 3 -> cost = 15;
        }
        int diff = money - cost;
        if (diff > 0) {
            System.out.printf("Your change: %d%n", diff);
        } else if (diff == 0) {
            System.out.println("Thank you for buying!");
        } else {
            System.out.println("Money is not enough!");
        }
    }

    /**
     * Function for cycle actions
     */
    public void cycleActions() {
        System.out.println("\nTask 2. Cycle actions");
        System.out.println("------");
        System.out.println("LOG_INFO: Cycle actions function starts");

        // Task 2.1
        System.out.println("\n2.1 Multiplication table for 4:");
        for (int i = 1; i < 11; i++) {
            System.out.printf("4 * %d = %d%n", i, 4 * i);
        }

        // Task 2.2
        System.out.println("\n2.2 Even numbers");
        System.out.print("Enter the number: ");
        int number = new Scanner(System.in).nextInt();
        while (number < 0) {
            System.out.print("Enter the correct number (n >= 0): ");
            number = new Scanner(System.in).nextInt();
        }
        System.out.printf("Even numbers from 0 to %d:%n", number);
        for (int i = 0; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // Task 2.3
        System.out.println("\n2.3 Fibonacci number");
        System.out.print("Enter the number: ");
        int num = new Scanner(System.in).nextInt();
        while (num < 0) {
            System.out.print("Enter the correct number (n >= 0): ");
            num = new Scanner(System.in).nextInt();
        }
        if (num == 0) {
            System.out.println("Fibonacci number with index 0 is 0");
        } else {
            int n0 = 0;
            int n1 = 1;
            for (int i = 2; i <= num; i++) {
                int n2 = n0 + n1;
                n0 = n1;
                n1 = n2;
            }
            System.out.printf("Fibonacci number with index %d is %d%n", num, n1);
        }

        // Task 2.4
        System.out.println("\n2.4 Factorial of number");
        System.out.print("Enter the number: ");
        int numb = new Scanner(System.in).nextInt();
        while (numb < 0) {
            System.out.print("Enter the correct number (n >= 0): ");
            numb = new Scanner(System.in).nextInt();
        }
        int result = 1;
        for (int i = 1; i <= numb; i++) {
            result = result * i;
        }
        System.out.printf("Factorial of number %d is %d%n", numb, result);

        // Task 2.5
        System.out.println("\n2.5 Chars from string");
        System.out.print("Enter the string: ");
        String str = new Scanner(System.in).nextLine();
        for (char c : str.toCharArray()) {
            System.out.println(c);
        }
    }

    /**
     * Function for array actions
     */
    public void arrayActions() {
        System.out.println("\nTask 3. Array actions");
        System.out.println("------");
        System.out.println("LOG_INFO: Array actions function starts");

        // Task 3.1
        System.out.println("\n3.1 Number of positive and negative numbers");
        int[] array = { 4, 34, -17, 2, -5, -78, 43, -1, 0, 9, 0, 0, 34, 34 };
        System.out.printf("Array = %s%n", Arrays.toString(array));
        int positive_count = 0;
        int negative_count = 0;
        int zero_count = 0;
        for (int n : array) {
            if (n > 0) {
                positive_count += 1;
            } else if (n == 0) {
                zero_count += 1;
            } else {
                negative_count += 1;
            }
        }
        System.out.printf("Number of positive numbers: %d%n", positive_count);
        System.out.printf("Number of negative numbers: %d%n", negative_count);
        System.out.printf("Number of zeros: %d%n", zero_count);

        // Task 3.2
        System.out.println("\n3.2 Sum of numbers with even indexes");
        System.out.printf("Array = %s%n", Arrays.toString(array));
        int even_sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                even_sum += array[i];
            }
        }
        System.out.printf("Sum of numbers with even indexes = %d%n", even_sum);

        // Task 3.3
        System.out.println("\n3.3 Sum of even elements");
        System.out.printf("Array = %s%n", Arrays.toString(array));
        int even_elem_sum = 0;
        for (int n : array) {
            if (n % 2 == 0) {
                even_elem_sum += n;
            }
        }
        System.out.printf("Sum of even elements = %d%n", even_elem_sum);

        // Task 3.4
        System.out.println("\n3.4 Maximum element");
        System.out.printf("Array = %s%n", Arrays.toString(array));
        int max_elem = array[0];
        for (int j : array) {
            if (j > max_elem) {
                max_elem = j;
            }
        }
        System.out.printf("Maximum element = %d%n", max_elem);

        // Task 3.5
        System.out.println("\n3.5 The largest number of identical elements");
        System.out.printf("Array = %s%n", Arrays.toString(array));
        HashMap<Integer, Integer> number_of_elements = new HashMap<>();
        for (int j : array) {
            if (number_of_elements.containsKey(j)) {
                number_of_elements.put(j, number_of_elements.get(j) + 1);
            } else {
                number_of_elements.put(j, 1);
            }
        }
        int max_value = 1;
        int max_key = array[0];
        for (Map.Entry<Integer, Integer> entry : number_of_elements.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if (value > max_value) {
                max_value = value;
                max_key = key;
            } else if (value == max_value && key > max_key) {
                max_key = key;
            }
        }
        if (max_value == 1) {
            System.out.println("All elements occur once");
        } else {
            System.out.printf("The largest number (%d) of identical elements has element %d%n", max_value, max_key);
        }

        // Task 3.6
        System.out.println("\n3.6 The numbers on the main diagonal");
        int[][] array10x10 = {
                { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 },
                { 2, 3, 4, 5, 6, 7, 8, 9, 0, 1 },
                { 3, 4, 5, 6, 7, 8, 9, 0, 1, 2 },
                { 4, 5, 6, 7, 8, 9, 0, 1, 2, 3 },
                { 5, 6, 7, 8, 9, 0, 1, 2, 3, 4 },
                { 6, 7, 8, 9, 0, 1, 2, 3, 4, 5 },
                { 7, 8, 9, 0, 1, 2, 3, 4, 5, 6 },
                { 8, 9, 0, 1, 2, 3, 4, 5, 6, 7 },
                { 9, 0, 1, 2, 3, 4, 5, 6, 7, 8 },
                { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }
        };
        System.out.println("Array = [");
        for (int i = 0; i < 10; i++) {
            System.out.println("\t" + Arrays.toString(array10x10[i]));
        }
        System.out.println("]");
        System.out.print("The numbers on the main diagonal: ");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j) {
                    System.out.print(array10x10[i][j] + " ");
                }
            }
        }
        System.out.println();

        // Task 3.7
        System.out.println("\n3.7 The numbers on the back diagonal");
        System.out.println("Array = [");
        for (int i = 0; i < 10; i++) {
            System.out.println("\t" + Arrays.toString(array10x10[i]));
        }
        System.out.println("]");
        System.out.print("The numbers on the back diagonal: ");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i + j == 9) {
                    System.out.print(array10x10[i][j] + " ");
                }
            }
        }
        System.out.println();

        // Task 3.8
        System.out.println("\n3.8 The largest sum of elements in column");
        int[][] array5x5 = {
                { 1, 2, 3, 4, 5 },
                { 2, 3, 4, 5, 6 },
                { 3, 4, 5, 6, 7 },
                { 4, 5, 6, 7, 8 },
                { 5, 6, 7, 8, 9 }
        };
        System.out.println("Array = [");
        for (int i = 0; i < 5; i++) {
            System.out.println("\t" + Arrays.toString(array5x5[i]));
        }
        System.out.println("]");
        int[] column_sum = new int[5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                column_sum[i] += array5x5[i][j];
            }
        }
        int max_column_sum = column_sum[0];
        for (int i = 0; i < 5; i++) {
            if (column_sum[i] > max_column_sum) {
                max_column_sum = column_sum[i];
            }
        }
        System.out.printf("The largest sum of elements in column is %d%n", max_column_sum);
    }
}
