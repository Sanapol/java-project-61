package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter."
                + "\n1 - Greet"
                + "\n2 - Even"
                + "\n3 - Calc"
                + "\n4 - GCD"
                + "\n5 - Progression"
                + "\n6 - Prime"
                + "\n0 - Exit");
        int choice = scanner.nextInt();
        switch (choice) {
            case Constants.EXIT:
                return;
            case Constants.RUN_CLI:
                Cli.greeting();
                break;
            case Constants.RUN_EVEN:
                Even.gameRun();
                break;
            case Constants.RUN_CALC:
                Calc.gameRun();
                break;
            case Constants.RUN_GCD:
                GCD.gameRun();
                break;
            case Constants.RUN_PROGRESSION:
                Progression.gameRun();
                break;
            case Constants.RUN_PRIME:
                Prime.gameRun();
                break;
            default:
                throw new RuntimeException("wrong operations");
        }
    }
}
