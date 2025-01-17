//sequence -> ABA, BCB, CDC...

import java.util.Scanner;

public class sequenceAba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms for the sequence: ");
        int terms = sc.nextInt();

        char first = 'A', middle = 'B', last = 'A';

        for (int i = 0; i < terms; i++) {
            System.out.print(first + "" + middle + "" + last + " ");
            first++;
            middle++;
            last++;
        }
        sc.close();
    }
}
