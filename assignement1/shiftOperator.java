public class shiftOperator {
    public static void main(String[] args) {
        int number = 8;

        // Multiply by 2 using left shift operator
        int multiplied = number << 1;

        // Divide by 4 using right shift operator
        int divided = number >> 2;

        System.out.println("Original number: " + number);
        System.out.println("Multiplied by 2: " + multiplied);
        System.out.println("Divided by 4: " + divided);
    }
}
