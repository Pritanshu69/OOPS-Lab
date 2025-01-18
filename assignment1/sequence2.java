//sequence-> A1,B2,C3...Z26,A1,B2...

import java.util.Scanner;

public class sequence2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms for the sequence: ");

        int terms = sc.nextInt();
        int count = 1;

        for (int i = 0; i < terms; i++) {
            char letter = (char) ('A' + (i % 26)); // Cycle through A-Z
            System.out.print(letter + "" + count + " ");
            count++;

            if (count > 26) {
                count = 1; // Reset count after 26
            }
        }
        sc.close();
    }
}