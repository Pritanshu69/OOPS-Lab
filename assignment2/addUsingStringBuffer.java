import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class addUsingStringBuffer{
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Enter the first number: ");
            int num1 = Integer.parseInt(br.readLine());

            System.out.print("Enter the second number: ");
            int num2 = Integer.parseInt(br.readLine());

            int sum = num1 + num2;
            System.out.println("The sum is: " + sum);
        }
        catch(IOException e){
            System.out.println("An error occurred: " + e);
        }
        catch(NumberFormatException e){
            System.out.println("Please enter a valid number: " + e);
        }
    }
}