//check palindrome  using static input

public class palindrome1{
    public static void main(String[] args){

        int number = 121;

        if(isPalindrome(number)){
            System.out.println(number + " is a palindrome number.");
        }
        else{
            System.out.println(number + " is not a palindrome number.");
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