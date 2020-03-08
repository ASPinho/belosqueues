package belosqueues.game.controllers;

import belosqueues.game.view.View;

/**
 * Abstract Controller
 */
public abstract class AbstractController implements Controller {

    protected View view;

    public void setView(View view) {
        this.view = view;
    }
}
