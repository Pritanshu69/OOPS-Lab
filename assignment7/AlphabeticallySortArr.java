import java.util.Scanner;
import java.util.Arrays;

public class AlphabeticallySortArr{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
      System.out.println("Enter the array: ");
      String input = sc.nextLine();

      char[] charArray = input.toCharArray();
      Arrays.sort(charArray);

      System.out.println("The sorted array is: " + new String(charArray));
  }
}


