package belosqueues.game.Classes;

public class PlayerFactory {

    public static Player newPlayer(Player.PlayerClasses playerClasses){
        if (playerClasses == Player.PlayerClasses.WARLOCK) {
            return new Warlock();
        }
        return new Warrior();
    }
}
