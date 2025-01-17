//whether a number is a palindrome or not using CLI

public class palindrome2{
    public static void main(String[] args){

        if(args.length != 1){
            System.out.println("Usage: java palindrome2 <number>");
            return;
        }
        int n = Integer.parseInt(args[0]);

        if(isPalindrome(n)){
            System.out.println(n + " is a palindrome number.");
        }
        else{
            System.out.println(n + " is not a palindrome number.");
        }
}
private static boolean isPalindrome(int n){
    int originalNUmber = n;
    int reversedNumber = 0;

    while(n!=0){
        int digit = n%10;   // extract the last numbers
        reversedNumber = reversedNumber * 10 + digit;   //build the reversed number
        n /= 10;  //remove the last digit
    }
    return originalNUmber == reversedNumber;
    }
}