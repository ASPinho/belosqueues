package belosqueues.game.view;

import belosqueues.game.controllers.TutorialController;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;

import static belosqueues.game.Messages.*;

/**
 * Tutorial View
 */
public class TutorialView extends AbstractView {

    private TutorialController tutorialController;

    public void setTutorialController(TutorialController tutorialController) {
        this.tutorialController = tutorialController;
    }

    public void show() {

        MenuInputScanner classMenuScanner = new MenuInputScanner(MENU());
        classMenuScanner.setMessage(CHOOSE_MENU);

        int choice = prompt.getUserInput(classMenuScanner);

        tutorialController.run(choice);

    }
}
