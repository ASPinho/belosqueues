package belosqueues.game;


import static belosqueues.game.Messages.*;

import belosqueues.game.player.Player;
import belosqueues.game.player.PlayerFactory;
import belosqueues.game.enemies.EnemyFactory;
import belosqueues.game.player.Warlock;
import belosqueues.game.stages.Arena;


import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println(INTRO);

        String[] classes = {"Warrior", "Warlock"};

        MenuInputScanner menuInputScanner = new MenuInputScanner(classes);
        menuInputScanner.setMessage(CHOOSE_CLASS);

        int choice = prompt.getUserInput(menuInputScanner);

    }

    /**
     * Bootstrap instantiation
     */
    private void bootStrap() {

        Bootstrap bootstrap = new Bootstrap();

    }



}
