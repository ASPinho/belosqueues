package belosqueues.game.Classes;

import belosqueues.game.entities.Enemy;

public class Warlock extends Player {

    //base atributes of this class

    public Warlock(PlayerClasses playerClasses){
        super(playerClasses.getSTAMINA(), playerClasses.getSTRENGTH(), playerClasses.getINTELLECT());
    }

    @Override
    public void attack(Enemy enemy) {

    }
}
