package belosqueues.game;

import belosqueues.game.Classes.Player;
import belosqueues.game.Classes.PlayerFactory;
import belosqueues.game.stages.Stage;
import belosqueues.game.stages.Tutorial;

public class Game {

    public static final int WIDTH = 12;
    public static final int HEIGHT = 16;
    public static final int CELLSIZE = 45;
    public static final int PADDING = 10;

    private Stage tutorial;
    private Player player;


    public Game(Player.PlayerClasses playerClasses){
        tutorialInit();
        player = PlayerFactory.newPlayer(playerClasses);
    }

    public void movePlayer(KeyboardController.MoveDirections direction){

        switch (direction){

            case UP:
                player.moveUp();
                break;

            case DOWN:
                player.moveDown();
                break;

            case LEFT:
                player.moveLeft();
                break;

            case RIGHT:
                player.moveRight();
                break;
        }

    }

    public void tutorialInit(){
        tutorial = new Tutorial();
    }

}
