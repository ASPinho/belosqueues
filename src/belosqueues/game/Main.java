package belosqueues.game;

import belosqueues.game.player.Player;
import belosqueues.game.player.PlayerFactory;
import belosqueues.game.enemies.EnemyFactory;
import belosqueues.game.stages.Arena;
import static belosqueues.game.Engine.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Engine.init();

        String pickedClass = scanner.nextLine().toLowerCase();

        switch (pickedClass){

            case "warlock":
                System.out.println("you've picked the warlock class");
                break;

            case "warrior":
                System.out.println("you've picked the warrior class");
                break;

            default:
                System.out.println("not a valid class");

        }

        //Game master = new Game(Player.PlayerClasses.WARLOCK);

        //KeyboardController kb = new KeyboardController(master);

        //Arena arena = new Arena(PlayerFactory.newPlayer(Player.PlayerClasses.WARRIOR), EnemyFactory.newEnemy());
        //arena.startBattle();

    }

}
