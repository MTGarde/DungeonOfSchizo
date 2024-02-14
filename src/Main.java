//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        Character player = new Character("Player");
        Character enemyGoblin = new Character("Goblin messenger", 10, 10);
        Character enemyWeevil = new Character("Weevil", 25, 10);
        Character enemyBoss = new Character("Goblin Schizomancer Kurts", 50, 10);

        String option;

        System.out.println();
        System.out.println("You enter the suspicious looking dungeon...");
        System.out.println("You encounter Goblin Messenger! \nprepare for battle...");

        do{
            player.printInfo();
            enemyGoblin.printInfo();
            System.out.println("What will you do? \nattack  |  heal  |  run");
            option = input.next();
            options:
            switch(option) {
                case "attack":
                    player.attackDamage(enemyGoblin, 10, 2);
                    break;
                case "heal":
                    player.healHealth();
                    break;
                case "run":
                    System.out.println("Come on you are better than this");
                    break;
                default:
                    System.out.println("Invalid input. Suffer the consequences.");

            }

            if(enemyGoblin.hp <= 0){
                break;
            }
            if(player.hp <= 0){
                System.out.println("You have died.");
                System.exit(0);
            }

            System.out.println("Goblin Messenger attacks!");
            enemyGoblin.attackDamage(player, 5, 0);

            player.getMana();
            enemyGoblin.getMana();
        } while(enemyGoblin.hp > 0 || player.hp > 0);


        System.out.println("You have successfully defeated the Goblin Messenger!");
        System.out.println();
        System.out.println("You feel the ground start to tremble...");
        System.out.println("A weevil appears from around the corner! \nprepare for battle...");

        do{
            player.printInfo();
            enemyWeevil.printInfo();
            System.out.println("What will you do? \nattack  |  heal  |  run");
            option = input.next();
            switch(option) {
                case "attack":
                    player.attackDamage(enemyWeevil, 10, 2);
                    System.out.println("You monster...");
                    break;
                case "heal":
                    player.healHealth();
                    break;
                case "run":
                    System.out.println("Come on you are better than this");
                    break;
                default:
                    System.out.println("Invalid input. Suffer the consequences.");
            }

            if(enemyWeevil.hp <= 0){
                break;
            }
            if(player.hp <= 0){
                System.out.println("You have died.");
                System.exit(0);
            }

            System.out.println("Weevil attacks!");
            enemyWeevil.attackDamage(player, 2, 0);

            player.getMana();
            enemyWeevil.getMana();
        } while(enemyWeevil.hp > 0 || player.hp > 0);


        System.out.println("You have successfully defeated the Weevil! I will remember that...");
        System.out.println();
        System.out.println("The floor is shaking more intensely...");
        System.out.println("You begin to feel fear moving forward");
        System.out.println("Goblin Schizomancer Kurts has appeared! \nprepare for battle...");

        do{
            player.printInfo();
            enemyBoss.printInfo();
            System.out.println("What will you do? \nattack  |  heal  |  run");
            option = input.next();
            switch(option) {
                case "attack":
                    System.out.println("Your attacks seem to be less effective");
                    player.attackDamage(enemyBoss, 8, 2);
                    System.out.println("You will regret that...");
                    break;
                case "heal":
                    player.healHealth();
                    break;
                case "run":
                    System.out.println("There is nowhere to run...");
                    break;
                default:
                    System.out.println("Invalid input. Suffer the consequences.");
            }

            if(enemyBoss.hp <= 0){
                break;
            }
            if(player.hp <= 0){
                System.out.println("You have died.");
                System.exit(0);
            }

            System.out.println("Goblin Schizomancer Kurts attacks!");
            enemyGoblin.attackDamage(player, 10, 4);

            player.getMana();
            enemyBoss.getMana();
        } while(enemyBoss.hp > 0 || player.hp > 0);


        System.out.println("You have successfully defeated Goblin Schizomancer Kurts. \nThe world seems to have been freed of a huge burden. \nYou have won.");

        input.close();
    }
}