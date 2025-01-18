import java.util.Scanner;

public class gcdLcm{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();

        int gcd = findGcd(a,b);
        int lcm = (a*b)/gcd;

        System.out.println("The GCD of " + a + " and " + b + " is: " + gcd);

        System.out.println("The LCM of " + a + " and " + b + " is: " + lcm);
        sc.close();
    }
private static int findGcd(int a, int b){
    if(b==0){
        return a;
    }
    else{
        return findGcd(b, a%b);
    }
}
}