package belosqueues.game;

import belosqueues.game.player.Player;

import java.util.Scanner;

public class Engine {

    public static final Scanner scanner = new Scanner(System.in);

    public static void init(){

        intro();
        chooseClass();
    }

    private static void intro(){

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("#######################################\n")
                     .append("=== Welcome to the belosQUEUEs game ===\n")
                     .append("===== The best infinite text-based ====\n")
                     .append("============ RPG Adventure ============\n")
                     .append("#######################################\n\n\n");

        System.out.println(stringBuilder);
    }

    private static void chooseClass(){

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("#######################################\n")
                     .append("=========== Pick your Class ===========\n")
                     .append("========= Warlock || Warrior ==========\n")
                     .append("=========== Choose Wisely =============\n")
                     .append("#######################################\n\n\n");

        System.out.println(stringBuilder);
    }

    /**
     * This class is supposed to manage actions and State changes.
     *
     *
     *
     *
     */


}
