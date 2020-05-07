import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Are you ready to start? [Y/N] ");
        String userInput = sc.nextLine();
        String userName = "";
        int heroHealth = 100;
        while (true) {
            if (userInput.toLowerCase().equals("n")) {
                break;
            } else if (userInput.toLowerCase().equals("y")) {
                System.out.print("What is your name?: ");
                userName = sc.nextLine();
                System.out.println("your name is: " + userName);
                System.out.printf("You have %s points \n ", heroHealth);
                System.out.println("Would you like to face the first DOT? [Y/N]?");
                String fightResponse = sc.nextLine();
                if (fightResponse.toLowerCase().equals("n")) {
                    break;
                } else if (fightResponse.toLowerCase().equals("y")) {
                    enemyOne(1, 20);
                }
            }
            break;
        }
    }

    public static void enemyOne(int min, int max) {
        Scanner sc = new Scanner(System.in);

        int dotOneHealth = 100;
        int playerHealth = 100;

        System.out.println("OK, Your first enemy is Dot1 | His/Her health is: " + dotOneHealth);

            while(playerHealth > 0 || dotOneHealth > 0) {
                System.out.println("Whats your move? ATTACK, DRINK POTION, RUN");
                String userMove = sc.nextLine();
                int randomNumberEnemy = new Random().nextInt((max - min) + 1) + min;
                int randomNumberHero = new Random().nextInt((max - min) + 1) + min;
                if (userMove.toLowerCase().equals("attack")) {
                    System.out.println("You Attacked");
                    dotOneHealth = attack(dotOneHealth, randomNumberEnemy);
                    System.out.println("Enemy health after attack: " + dotOneHealth);
                    playerHealth = enemyAttack(playerHealth, randomNumberHero);
                    System.out.println("You were attacked by DOT1. Your health is " + playerHealth);
                } else if (userMove.toLowerCase().equals("drink potion")) {
                    System.out.println("glug...glug...glug, finished your potion");
                    playerHealth = drinkPotion(playerHealth);
                    System.out.println("Your health is: " + playerHealth);
                } else if (userMove.toLowerCase().equals("run")) {
                    System.out.println("WOW, you're the worst. BYE!");
                    break;
                }

            }
            while(true) {
                if (dotOneHealth < playerHealth && dotOneHealth <= 0) {
                    System.out.println("YOU WON");
break;

                } else if (playerHealth < dotOneHealth && playerHealth <= 0) {
                    System.out.println("YOU LOST...loser");
break;
                }
            }
        }

    public static int attack(int arg1, int arg2){
        return arg1 - arg2;
    }
    public static int drinkPotion(int arg1) {
        return arg1 + 20;

    }
    public static int enemyAttack(int arg1, int arg2){
        return arg1 - arg2;
    }
}
