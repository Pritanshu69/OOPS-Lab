import java.util.Scanner;

public class temperature{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the temperature in Celsius: ");
        double farenheit = sc.nextDouble();

        double Celsius = (farenheit - 32) * 5/9;

        System.out.printf("The temperature in Celsius is: %.2f%n", Celsius , );

        sc.close();
    }
}