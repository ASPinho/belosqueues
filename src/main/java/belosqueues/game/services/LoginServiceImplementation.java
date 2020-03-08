package belosqueues.game.services;

import belosqueues.game.player.Player;
import belosqueues.game.player.PlayerFactory;

public class LoginServiceImplementation implements LoginService{

    Player player;
    PlayerFactory factory;

    public LoginServiceImplementation(){
        factory = new PlayerFactory();
    }

    @Override
    public void setPlayer(String name, int playerClass) {
        player = factory.newPlayer(name, Player.PlayerClasses.values()[playerClass]);
    }
}
