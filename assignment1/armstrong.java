//Print all the armstrong numbers in the given range
import java.util.Scanner;

public class armstrong{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lower limit of the range: ");
        int lower = sc.nextInt();
        System.out.println("Enter the upper limit of the range: ");
        int upper = sc.nextInt();

        System.out.println("The armstrong numbers in the range " + lower + " to " + upper + " are: ");
        for(int i=lower;i<=upper;i++){
            if(isArmstrong(i)){
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
    private static boolean  isArmstrong(int n){
        int sum = 0; 
        int original = n;
        int digit = String.valueOf(n).length();
        while(n>0){
            int power = n%10;
            sum += Math.pow(power,digit);
            n/=10;
        }
        return sum == original;
    }
}