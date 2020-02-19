package belosqueues.game.Classes;

import belosqueues.game.entities.Enemy;

public class Warrior extends Player {

    //base atributes of this class
    private static final int STAMINA = 250;
    private static final int STRENGTH = 100;
    private static final int INTELLECT = 50;

    public Warrior(){
        super(STAMINA, STRENGTH, INTELLECT);
    }

    @Override
    public void attack(Enemy enemy) {

    }
}
