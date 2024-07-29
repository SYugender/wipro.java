package assignment1;

import java.util.Scanner;

public class SumofIntegers {
    
    int sum = 0;
    boolean error = false;

    public void sumOfInt(Scanner lineScan) {
        while (lineScan.hasNext()) {
            if (lineScan.hasNextInt()) {
                sum += lineScan.nextInt();
            } else {
                System.out.println("Error: Non-integer value");
                error = true;
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers with Spaces:");
        String input = scanner.nextLine();
        Scanner lineScan = new Scanner(input);

        SumofIntegers sumIntegers = new SumofIntegers();
        sumIntegers.sumOfInt(lineScan);

        if (!sumIntegers.error) {
            System.out.println("Sum of the given integers: " + sumIntegers.sum);
        }

        lineScan.close();
        scanner.close();
    }
}
