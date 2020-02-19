package belosqueues.game;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class KeyboardController implements KeyboardHandler {

    private Game game;

    KeyboardController(Game game){
        this.game = game;
        listenerInit();
    }

    public void listenerInit(){

        KeyboardEvent[] events = new KeyboardEvent[5];

        for (int i = 0; i < events.length; i++) {
            events[i] = new KeyboardEvent();
        }

        events[0].setKey(KeyboardEvent.KEY_W);
        events[0].setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        events[1].setKey(KeyboardEvent.KEY_S);
        events[1].setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        events[2].setKey(KeyboardEvent.KEY_A);
        events[2].setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        events[3].setKey(KeyboardEvent.KEY_D);
        events[3].setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        events[4].setKey(KeyboardEvent.KEY_Q);
        events[4].setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        Keyboard kb = new Keyboard(this);

        for (KeyboardEvent event : events) {
            kb.addEventListener(event);
        }
    }

    @Override
    public void keyPressed(KeyboardEvent event) {

        switch (event.getKey()){
            //move Up
            case KeyboardEvent.KEY_W:
                game.movePlayer(MoveDirections.UP);
                break;
            //move Down
            case KeyboardEvent.KEY_S:
                game.movePlayer(MoveDirections.DOWN);
                break;
            //move Left
            case KeyboardEvent.KEY_A:
                game.movePlayer(MoveDirections.LEFT);
                break;
            //move Right
            case KeyboardEvent.KEY_D:
                game.movePlayer(MoveDirections.RIGHT);
                break;
            //quit for test efficiency
            case KeyboardEvent.KEY_Q:
                System.exit(0);
                break;
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
    }

    public enum MoveDirections{
        UP,
        DOWN,
        LEFT,
        RIGHT,
    }

}
