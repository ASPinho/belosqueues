package belosqueues.game;

import belosqueues.game.controllers.LoginController;
import belosqueues.game.view.LoginView;

/**
 * Responsible for wiring the objects dependencies
 */
public class Bootstrap {

    public GameEngine init(){

        LoginController loginController = new LoginController();
        LoginView loginView = new LoginView();

        loginController.setView(loginView);
        loginView.setLoginController(loginController);


        return new GameEngine();
    }


}
