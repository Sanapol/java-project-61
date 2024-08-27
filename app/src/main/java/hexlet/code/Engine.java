package hexlet.code;

import hexlet.code.games.*;

import hexlet.code.Constants;

import java.util.Scanner;

class Engine {
    public static void run(int games) {
        Scanner scanner = new Scanner(System.in);
        String[][] questionAnswer = new String[Constants.NUMBER_OF_ROUNDS][Constants.ONE_ROUND];
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        var userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");

        switch (games) {
            case 1:
                System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
                questionAnswer = Even.gameRun();
                break;
            case 2:
                System.out.println("What is the result of the expression?");
                questionAnswer = Calc.gameRun();
                break;
            case 3:
                System.out.println("Find the greatest common divisor of given numbers.");
                questionAnswer = GCD.gameRun();
                break;
            case 4:
                System.out.println("What number is missing in the progression?");
                questionAnswer = Progression.gameRun();
                break;
            case 5:
                System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
                questionAnswer = Prime.gameRun();
                break;
            default:
                throw new RuntimeException("wrong operations");
        }

        for (var i = 0; i < Constants.NUMBER_OF_ROUNDS; i++) {
            System.out.println("Question: " + questionAnswer[i][0] + "\nYour answer: ");
            String userAnswer = scanner.nextLine();
            if (userAnswer.equalsIgnoreCase(questionAnswer[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was "
                        + questionAnswer[i][1] + ".\nLet's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
