import java.util.Scanner;

public class fibonacci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms you want to print: ");
        int n = sc.nextInt();

        System.out.println("The first " + n + " terms of the fibonacci series are: ");
        for(int i=0;i<n;i++){
            System.out.print(fib(i) + " ");
        }
        sc.close();
    }
    private static int fib(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        else{
            return fib(n-1) + fib(n-2);
        }
    }
}