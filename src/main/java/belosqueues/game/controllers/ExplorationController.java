package belosqueues.game.controllers;

import belosqueues.game.view.View;

/**
 * Exploration Controller
 */
public class ExplorationController extends AbstractController {

    View explorationView;

    public void init() {
        view.show();
    }

    public void setExplorationView(View explorationView) {
        this.explorationView = explorationView;
    }
}
