// Write a program to read the price of an item in the decimal form (like 75.95) and print the output in paise (like 7595 paise). 

import java.util.Scanner;

public class priceToPaisa{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the price (e.g., 75.95): ");
        double price = scanner.nextDouble();

        System.out.println("The price in paise is: " + (int)(price * 100) + " paise");

        scanner.close();
    }
}


