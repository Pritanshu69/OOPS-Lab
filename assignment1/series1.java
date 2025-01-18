//Write a program to determine sum of the following series for given value of n: 
//  1 - 1/22 + 1/32 - ..... + 1/n2 

import java.util.Scanner;

public class series1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        double sum = 0.0;
        for(int i = 1; i <= n; i++){
            sum += Math.pow(-1, i + 1)/(i * 1);
        }
        System.out.printf("The sum of the series is: %.6f%n" ,sum);

        sc.close();
    }
}
