package hexlet.code;

import java.util.Scanner;

public class Even {
    public static void gameEven() {
        Scanner scanner = new Scanner(System.in);
        var numberOfResponses = 0;

        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        var userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (var i = 1; i <= 3; i++) {
            int random = (int) (Math.random() * 100);
            System.out.println("Question: " + random + "\nYour answer: ");
            var answer = scanner.nextLine();
            if (random % 2 == 0) {
                if (answer.equalsIgnoreCase("yes")) {
                    System.out.println("Correct!");
                    numberOfResponses += 1;
                } else {
                    System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was 'yes'."
                            + "\nLet's try again, " + userName + "!");
                    break;
                }
            } else {
                if (answer.equalsIgnoreCase("no")) {
                    System.out.println("Correct!");
                    numberOfResponses += 1;
                } else {
                    System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was 'yes'."
                            + "\nLet's try again, " + userName + "!");
                    break;
                }
            }
        }
        if (numberOfResponses == 3) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
