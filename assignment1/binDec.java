import java.util.Scanner;

public class binDec{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Choose an option to perfom: ");
        System.out.println("1. Convert Binary to Decimal");
        System.out.println("2. Convert Decimal to Binary");
        int choice = sc.nextInt();

        switch(choice){
            case 1:
                System.out.println("Enter a binary number: ");
                String binary = sc.next();
                int decimal = Integer.parseInt(binary,2);
                System.out.println("The decimal equivalent of " + binary + " is: " + decimal);
                break;
            case 2:
                System.out.println("Enter a decimal number: ");
                int Decimal = sc.nextInt();
                String Binary =Integer.toBinaryString(Decimal);
                System.out.println("The binary equivalent of " + Decimal + " is: " + Binary);
                break;

            default:
                System.out.println("Invalid choice");
        }
        sc.close();
    }
}