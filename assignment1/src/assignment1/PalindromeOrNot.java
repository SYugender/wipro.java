package assignment1;

import java.util.Scanner;

public class PalindromeOrNot {
    
    long number;
    
    public void checkPalindromeOrNot() {
        long originalNumber = number;
        long reversedNumber = 0;
        long evenSum = 0;
        
        while (number != 0) {
            long digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
            
            if (digit % 2 == 0) {
                evenSum += digit;
            }
        }
        
        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is Palindrome");
            
            if (evenSum > 25) {
                System.out.println("The sum of even numbers is Greater than 25");
            } else {
                System.out.println("The sum of even numbers is less than or Equal to 25");
            }
        } else {
            System.out.println(originalNumber + " is not a Palindrome");
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        long number = scanner.nextLong();
        
        PalindromeOrNot palindromeOrNot = new PalindromeOrNot();
        palindromeOrNot.number = number;
        palindromeOrNot.checkPalindromeOrNot();
        
        scanner.close();
    }
}

