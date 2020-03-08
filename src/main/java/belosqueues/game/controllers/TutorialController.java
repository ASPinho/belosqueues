package belosqueues.game.controllers;

import belosqueues.game.MenuOptions;
import belosqueues.game.view.View;

import java.util.Map;

/**
 * Tutorial Controller
 */
public class TutorialController extends AbstractController {

    View tutorialView;
    Map<Integer, Controller> controllerMap;

    public void init() {
        tutorialView.show();
    }

    public void run(int choice){

        if(choice == MenuOptions.QUIT.getOption()){
            return;
        }
        controllerMap.get(choice).init();
    }

    public void setTutorialView(View tutorialView) {
        this.tutorialView = tutorialView;
    }

    public void setControllerMap(Map<Integer, Controller> controllerMap) {
        this.controllerMap = controllerMap;
    }
}
