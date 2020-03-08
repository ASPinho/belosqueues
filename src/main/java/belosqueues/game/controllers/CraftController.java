package belosqueues.game.controllers;

import belosqueues.game.view.View;

/**
 * Craft Controller
 */
public class CraftController extends AbstractController {

    View craftView;

    public void init() {
        view.show();
    }

    public void setCraftView(View craftView) {
        this.craftView = craftView;
    }
}
