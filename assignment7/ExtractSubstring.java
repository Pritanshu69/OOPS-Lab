import java.util.Scanner;

public class ExtractSubstring{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the string: ");
    String str = sc.nextLine();
    System.out.print("Enter the starting index: ");
    int n = sc.nextInt();
    System.out.print("Enter the ending index: ");
    int m = sc.nextInt();

    String extracted = str.substring(n, m);
    System.out.println("The extracted string: "+ extracted);
  }
}
