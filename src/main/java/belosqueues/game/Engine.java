package belosqueues.game;

import belosqueues.game.player.Player;
import belosqueues.game.stateprints.GameState;
import belosqueues.game.stateprints.TutorialState;

import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class Engine {

    // Engine utilities

    private static final Scanner scanner = new Scanner(System.in);
    private ConcurrentHashMap<String, GameState> commandList= new ConcurrentHashMap<>();

    // General Properties

    private static Game master;
    private static GameState gameState;
    private static String nickname;

    // Engine methods

    public static void init(){

        intro();
        chooseNickname();
        chooseClass();

        gameLoop();

    }

    private static void gameLoop(){

        while (true){

            gameState.print();
        }
    }

    private static void intro(){

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("\n#######################################\n")
                     .append("#== Welcome to the belosQUEUEs game ==#\n")
                     .append("#==== The best infinite text-based ===#\n")
                     .append("#=========== RPG Adventure ===========#\n")
                     .append("#######################################\n");

        System.out.println(stringBuilder);
    }

    private static void chooseNickname(){

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("\n#######################################\n")
                     .append("#====== Choose your Hero's name ======#\n")
                     .append("#######################################\n");

        System.out.println(stringBuilder);

        System.out.print("Nickname: ");

        nickname = scanner.nextLine();

    }

    private static void chooseClass(){

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("\n#######################################\n")
                     .append("#========== Pick your Class ==========#\n")
                     .append("#======== Warlock || Warrior =========#\n")
                     .append("#========== Choose Wisely ============#\n")
                     .append("#######################################\n");

        System.out.println(stringBuilder);

        System.out.print("Class: ");

        gameInit(scanner.nextLine().toLowerCase());
    }

    public static void gameInit(String pickedClass){

        switch (pickedClass){

            case "warlock":
                master = new Game(Player.PlayerClasses.WARLOCK);
                break;

            case "warrior":
                master = new Game(Player.PlayerClasses.WARRIOR);
                break;

            default:
                System.out.println("That is not a valid class");
                chooseClass();
        }

        gameState = new TutorialState();

    }


    /**
     * This class is supposed to manage actions and State changes.
     *
     *
     *
     *
     */


}
