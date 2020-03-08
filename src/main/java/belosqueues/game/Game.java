package belosqueues.game;


import static belosqueues.game.Messages.*;

import belosqueues.game.player.Player;
import belosqueues.game.player.PlayerFactory;
import belosqueues.game.enemies.EnemyFactory;
import belosqueues.game.player.Warlock;
import belosqueues.game.stages.Arena;


import belosqueues.game.view.LoginView;
import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;

import java.util.Scanner;

public class Game {

    private GameEngine engine;

    public Game(){}

    public static void main(String[] args) {

    Game game = new Game();
    game.bootStrap();

    }

    /**
     * Bootstrap instantiation
     */
    private void bootStrap() {
        Bootstrap bootstrap = new Bootstrap();
        engine = bootstrap.init();

    }



}
