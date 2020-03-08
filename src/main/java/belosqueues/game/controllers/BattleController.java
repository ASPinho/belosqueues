package belosqueues.game.controllers;

import belosqueues.game.view.View;

/**
 * Battle Controller
 */
public class BattleController extends AbstractController {

    View battleView;

    public void init() {
        view.show();
    }

    public void setBattleView(View battleView) {
        this.battleView = battleView;
    }
}
