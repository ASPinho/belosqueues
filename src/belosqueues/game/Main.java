package belosqueues.game;

import belosqueues.game.Classes.Player;
import belosqueues.game.Classes.PlayerFactory;
import belosqueues.game.entities.Enemy;
import belosqueues.game.entities.EnemyFactory;
import belosqueues.game.entities.Voldemort;
import belosqueues.game.stages.Arena;

public class Main {

    public static void main(String[] args) {

        //Game master = new Game(Player.PlayerClasses.WARLOCK);

        //KeyboardController kb = new KeyboardController(master);

        Arena arena = new Arena(PlayerFactory.newPlayer(Player.PlayerClasses.WARRIOR), EnemyFactory.newEnemy());
        arena.startBattle();

    }

}
