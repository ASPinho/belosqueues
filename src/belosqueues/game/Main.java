package belosqueues.game;

import belosqueues.game.player.Player;

public class Main {

    public static void main(String[] args) {

        Game master = new Game(Player.PlayerClasses.WARLOCK);

        KeyboardController kb = new KeyboardController(master);

    }

}
