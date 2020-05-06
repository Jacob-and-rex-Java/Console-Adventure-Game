import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Are you ready to start? [y/n]");
        String userInput = sc.nextLine();
        String userName = "";
        while (true) {
            if (userInput.toLowerCase().equals("n")) {
                break;
            } else if (userInput.toLowerCase().equals("y")) {
                System.out.print("What is your name?");
                userName = sc.nextLine();
                System.out.print("your name is: " + userName);
                break;
            };
        }
    }
}
