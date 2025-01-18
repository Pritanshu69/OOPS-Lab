import java.util.Scanner;

public class AppendStringToCharArray{
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    char[] charArray = {'A','B','C','D','E'};
    System.out.println("Enter the String you want to append: ");
    String str = sc.nextLine();

    String combined = new String(charArray) + str;
    System.out.println("The combined string is: " + combined);
  }
}
