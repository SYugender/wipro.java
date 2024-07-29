package assignment1;
import java.util.Scanner;

public class TomAndJerry {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an Integer:");
		int number = scanner.nextInt();
		
		if (number >= 20 && number <= 30) {
			if (number % 2 == 0) {
				System.out.println("Jerry");
			}
			else {
				System.out.println("Tom");
			}
				
		} else {
			System.out.println("The number is outside the range of 20 to 30");
		}
		scanner.close();
	}
}
