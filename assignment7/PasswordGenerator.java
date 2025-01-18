import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter your middle name (leave blank if none): ");
        String middleName = sc.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = sc.nextLine();

        System.out.print("Enter your roll number: ");
        String rollNumber = sc.nextLine();

        String initials = firstName.charAt(0) + 
              (middleName.isEmpty() ? "" : String.valueOf(middleName.charAt(0))) +
              lastName.charAt(0);
              String lastFour = rollNumber.length() > 4 ? rollNumber.substring(rollNumber.length() - 4) : rollNumber;
              System.out.println("Generated Password: " + initials.toUpperCase() + lastFour);
    }
}
