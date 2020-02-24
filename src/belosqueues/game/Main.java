package belosqueues.game;

import belosqueues.game.player.Player;
import belosqueues.game.player.PlayerFactory;
import belosqueues.game.enemies.EnemyFactory;
import belosqueues.game.stages.Arena;

public class Main {

    public static void main(String[] args) {

        Game master = new Game(Player.PlayerClasses.WARLOCK);

        KeyboardController kb = new KeyboardController(master);

        Arena arena = new Arena(PlayerFactory.newPlayer(Player.PlayerClasses.WARRIOR), EnemyFactory.newEnemy());
        arena.startBattle();

    }

}
