package assignment1;
import java.util.Scanner;

public class UniqueNumbers {
	
	public static boolean unique(int number) {
		String numString = Integer.toString(number);
		int length = numString.length();
		
		for (int i = 0; i < length - 1; i++) {
			for (int j = i + 1; j< length; j++) {
				if (numString.charAt(i) == numString.charAt(j)) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the integer value: ");
		int number = scanner.nextInt();
		
		if (number <= 0) {
            System.out.println("Please enter a positive integer value.");
        } else {
            if (unique(number)) {
                System.out.println(number + " is a Unique number.");
            } else {
                System.out.println(number + " is not a Unique number.");
            }
        }

        scanner.close();
	}
}
