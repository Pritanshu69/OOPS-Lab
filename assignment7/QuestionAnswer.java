import java.util.Scanner;

public class QuestionAnswer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctAnswer = "James Gosling";

        for (int i = 1; i <= 3; i++) {
            System.out.print("Who is the inventor of Java? ");
            String answer = sc.nextLine();

            if (answer.equalsIgnoreCase(correctAnswer)) {
                System.out.println("Good");
                return;
            } else if (i < 3) {
                System.out.println("Try Again");
            } else {
                System.out.println("The correct answer is: " + correctAnswer);
            }
        }
    }
}

