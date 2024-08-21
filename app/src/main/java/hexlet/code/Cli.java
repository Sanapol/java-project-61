package hexlet.code;

import java.util.Scanner;

class Cli {
    public static void userName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("May I have your name?");
        var name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
