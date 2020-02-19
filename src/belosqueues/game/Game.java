package belosqueues.game;

import belosqueues.game.stages.Stage;
import belosqueues.game.stages.Tutorial;

public class Game {

    public static final int WIDTH = 12;
    public static final int HEIGHT = 16;
    public static final int CELLSIZE = 45;
    public static final int PADDING = 10;

    private Stage tutorial;


    public Game(){
        tutorialInit();
    }



    public void tutorialInit(){
        tutorial = new Tutorial();
    }

}
