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
                + "\n0 - Exit");
        var choice = scanner.nextInt();
        switch (choice) {
            case 0:
                return;
            case 1:
                Cli.greeting();
                break;
            case 2:
                Engine.run(1);
                break;
            case 3:
                Engine.run(2);
                break;
            case 4:
                Engine.run(3);
                break;
            case 5:
                Engine.run(4);
                break;
            default:
                throw new RuntimeException("wrong operations");
        }
    }
}
