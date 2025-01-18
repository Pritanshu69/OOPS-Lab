//1. Take a sting from keyboard and convert into character array (new one). 

import java.util.Scanner;

public class StringToCharArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        char[] charArray = input.toCharArray();

        System.out.println("Character Array: ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
    }
}
