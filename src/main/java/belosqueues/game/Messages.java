package belosqueues.game;

import belosqueues.game.player.Player;
import org.academiadecodigo.bootcamp.Prompt;

public class Messages {

    public static final Prompt prompt = new Prompt(System.in, System.out);

    public static final String INTRO = "#######################################\n"
                               .concat("#== Welcome to the belosQUEUEs game ==#\n")
                               .concat("#==== The best infinite text-based ===#\n")
                               .concat("#=========== RPG Adventure ===========#\n")
                               .concat("#######################################\n");

    public static final String CHOOSE_NAME = "#######################################\n"
                                     .concat("#====== Choose your Hero's name ======#\n")
                                     .concat("#######################################\n\n");

    public static final String CHOOSE_CLASS = "#######################################\n"
                                      .concat("#====== Choose your Hero's class =====#\n")
                                      .concat("#######################################");

    public static String[] CLASSES(){

        String[] classes = new String[Player.PlayerClasses.values().length];

        for (int i = 0; i < Player.PlayerClasses.values().length; i++){
            classes[i] = Player.PlayerClasses.values()[i].toString();
        }
        return classes;
    }
}
