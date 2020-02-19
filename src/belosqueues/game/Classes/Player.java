package belosqueues.game.Classes;

import belosqueues.game.entities.Enemy;

public abstract class Player {


    //Player attributes
    protected int stamina;
    protected int strength;
    protected int intellect;
    protected int armor;

    public Player(int stamina, int strength, int intellect){
        this.stamina = stamina;
        this.strength = strength;
        this.intellect = intellect;
    }

    public abstract void attack(Enemy enemy);



}
