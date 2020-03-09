package belosqueues.game;

import static belosqueues.game.Messages.*;

import java.util.Scanner;

public class Game {

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
        bootstrap.init();

    }



}
