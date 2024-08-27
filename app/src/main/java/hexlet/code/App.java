package hexlet.code;

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
        var choice = scanner.nextInt();
        switch (choice) {
            case Constants.EXIT:
                return;
            case Constants.RUN_CLI:
                Cli.greeting();
                break;
            case Constants.RUN_EVEN:
                Engine.run(Constants.RUN_EVEN);
                break;
            case Constants.RUN_CALC:
                Engine.run(Constants.RUN_CALC);
                break;
            case Constants.RUN_GCD:
                Engine.run(Constants.RUN_GCD);
                break;
            case Constants.RUN_PROGRESSION:
                Engine.run(Constants.RUN_PROGRESSION);
                break;
            case Constants.RUN_PRIME:
                Engine.run(Constants.RUN_PRIME);
                break;
            default:
                throw new RuntimeException("wrong operations");
        }
    }
}
