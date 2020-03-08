package belosqueues.game.view;

import belosqueues.game.controllers.Controller;
import belosqueues.game.controllers.LoginController;

/**
 * Battle View
 */
public class BattleView extends AbstractView {

    Controller batlleController;


    public void show() {

    }

    public void setBatlleController(Controller batlleController) {
        this.batlleController = batlleController;
    }
}
