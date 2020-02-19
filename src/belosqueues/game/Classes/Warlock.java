package belosqueues.game.Classes;

import belosqueues.game.entities.Enemy;

public class Warlock extends Player {

    //base atributes of this class
    private static final int STAMINA = 170;
    private static final int STRENGTH = 20;
    private static final int INTELLECT = 200;

    public Warlock(){
        super(STAMINA, STRENGTH, INTELLECT);
    }

    @Override
    public void attack(Enemy enemy) {

    }
}
