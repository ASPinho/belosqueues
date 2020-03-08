package belosqueues.game.controllers;

import belosqueues.game.services.LoginService;
import belosqueues.game.services.PlayerService;

/**
 * Login Controller
 */
public class LoginController extends AbstractController {

    LoginService loginService;
    Controller nextController;


    public void init() {
        view.show();

        nextController.init();

    }

    public void createANewPlayer(String name, int playerClass){
        loginService.setPlayer(name, playerClass - 1);
    }

    public void setLoginService(LoginService loginService) {
        this.loginService = loginService;
    }

    public void setNextController(Controller nextController) {
        this.nextController = nextController;
    }
}
