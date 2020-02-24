package belosqueues.game.Classes;

public class PlayerFactory {

    public static Player newPlayer(Player.PlayerClasses playerClasses){

        Player player = null;

        switch (playerClasses){

            case WARLOCK:
                player = new Warlock();
                break;

            case WARRIOR:
                player = new Warrior();
                break;
        }

       return player;

    }
}
