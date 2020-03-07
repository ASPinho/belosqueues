package belosqueues.game;

import org.academiadecodigo.bootcamp.Prompt;

public class Messages {

    public static final Prompt prompt = new Prompt(System.in, System.out);

    public static final String INTRO = "\n#######################################\n"
                               .concat("#== Welcome to the belosQUEUEs game ==#\n")
                               .concat("#==== The best infinite text-based ===#\n")
                               .concat("#=========== RPG Adventure ===========#\n")
                               .concat("#######################################\n");

    public static final String CHOOSE_NAME = "\n#######################################\n"
                                     .concat("#====== Choose your Hero's name ======#\n")
                                     .concat("#######################################\n");

    public static final String CHOOSE_CLASS = "\n#######################################\n"
                                      .concat("#========== Pick your Class ==========#\n")
                                      .concat("#======== Warlock || Warrior =========#\n")
                                      .concat("#========== Choose Wisely ============#\n")
                                      .concat("#######################################\n");


}
