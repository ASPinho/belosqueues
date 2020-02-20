package belosqueues.game.Classes;

import belosqueues.game.entities.Enemy;

public class Warrior extends Player {

    //base atributes of this class

    public Warrior(PlayerClasses playerClasses){
        super(playerClasses.getSTAMINA(), playerClasses.getSTRENGTH(), playerClasses.getINTELLECT());
    }

    @Override
    public void attack(Enemy enemy) {

    }
}
