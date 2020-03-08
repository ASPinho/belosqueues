package belosqueues.game.view;

import belosqueues.game.controllers.LoginController;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;

import static belosqueues.game.Messages.*;

/**
 * Login View
 */
public class LoginView extends AbstractView {

    private LoginController loginController;

    public void setLoginController(LoginController loginController) {
        this.loginController = loginController;
    }

    public void show() {

        System.out.println(INTRO);

        StringInputScanner nameScanner = new StringInputScanner();
        nameScanner.setMessage(CHOOSE_NAME);

        String name = prompt.getUserInput(nameScanner);


        MenuInputScanner classMenuScanner = new MenuInputScanner(CLASSES());
        classMenuScanner.setMessage(CHOOSE_CLASS);

        int choice = prompt.getUserInput(classMenuScanner);

        loginController.createANewPlayer(name, choice);

    }
}
