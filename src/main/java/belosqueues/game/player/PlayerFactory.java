package belosqueues.game.player;

public class PlayerFactory {

    public Player newPlayer(String name, Player.PlayerClasses playerClasses){

        Player player = null;

        switch (playerClasses){

            case WARLOCK:
                player = new Warlock(name);
                break;

            case WARRIOR:
                player = new Warrior(name);
                break;
        }

       return player;

    }
}
