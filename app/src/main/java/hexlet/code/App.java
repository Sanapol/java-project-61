package hexlet.code;

import java.util.Scanner;

class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter." +
                "\n2 - Even" +
                "\n1 - Greet" +
                "\n0 - Exit");
        var choice = scanner.nextInt();
        if (choice == 0) {
            System.exit(0);
        } else if (choice == 1) {
            Cli.greeting();
        } else if (choice == 2) {
            Even.gameEven();
        }
    }
}
