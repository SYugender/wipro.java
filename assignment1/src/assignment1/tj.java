package assignment1;
import java.util.Scanner;
public class tj {
	int number;
	
	public void EvenOrOddCheck() {
		if(number >= 20 && number <= 30) {
			
			if(number % 2 ==0) {
				System.out.println("Jerry");
			}
			else {
				System.out.println("Tom");
			}
		}
		else {
			System.out.println("You have to give namber in between the range of 20 to 30");
		}
	}
		
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number from 20 to 30");
		int number = scanner.nextInt();
		tj obj = new tj();
		obj.number = number;
		obj.EvenOrOddCheck();
		scanner.close();
	}

}
