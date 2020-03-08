package belosqueues.game;

import belosqueues.game.controllers.*;
import belosqueues.game.services.*;
import belosqueues.game.view.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Responsible for wiring the objects dependencies
 */
public class Bootstrap {

    public GameEngine init(){

        PlayerService playerService = new PlayerServiceImplementation();
        ArenaService arenaService = new ArenaServiceImplementation();
        LoginService loginService = new LoginServiceImplementation();

        LoginView loginView = new LoginView();
        LoginController loginController = new LoginController();
        loginView.setLoginController(loginController);
        loginController.setView(loginView);


        TutorialView tutorialView = new TutorialView();
        TutorialController tutorialController = new TutorialController();
        tutorialView.setTutorialController(tutorialController);
        tutorialController.setTutorialView(tutorialView);

        ExplorationView explorationView = new ExplorationView();
        ExplorationController explorationController = new ExplorationController();
        explorationView.setExplorationController(explorationController);
        explorationController.setExplorationView(explorationView);

        CraftView craftView = new CraftView();
        CraftController craftController = new CraftController();
        craftView.setCraftController(craftController);
        craftController.setCraftView(craftView);

        BattleView battleView = new BattleView();
        BattleController battleController = new BattleController();
        battleView.setBatlleController(battleController);
        battleController.setBattleView(battleView);


        loginController.setLoginService(loginService);
        loginController.setNextController(tutorialController);

        Map<Integer,Controller> controllerMap = new HashMap<>();
        controllerMap.put(MenuOptions.EXPLORATION.getOption(), explorationController);
        controllerMap.put(MenuOptions.CRAFT.getOption(), craftController);
        controllerMap.put(MenuOptions.BATTLE.getOption(), battleController);

        tutorialController.setControllerMap(controllerMap);

        loginController.init();

        return new GameEngine();
    }


}
