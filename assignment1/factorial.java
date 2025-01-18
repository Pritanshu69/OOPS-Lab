import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();


        long factorial = calculateFactorial(number);

        System.out.println("Factorial of " + number + " is: " + factorial);

        scanner.close();
    }
    private static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1; 
        }
        return n * calculateFactorial(n - 1); 
    }
}
