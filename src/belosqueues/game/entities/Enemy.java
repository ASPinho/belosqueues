package belosqueues.game.entities;

import belosqueues.game.Game;
import belosqueues.game.components.Position;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public abstract class Enemy {

    //graphic && logic representation
    protected Rectangle enemy;
    protected Position pos;

    //Player attributes
    protected int stamina;
    protected int strength;
    protected int intellect;

    public Enemy (int stamina, int strength, int intellect){
        this.stamina = stamina;
        this.strength = strength;
        this.intellect = intellect;
        pos = new Position(10,20);
        enemy = new Rectangle(Game.PADDING + pos.getCol() * Game.CELLSIZE, Game.PADDING + pos.getRow() * Game.CELLSIZE, Game.CELLSIZE, Game.CELLSIZE);
        enemy.fill();
    }

    public void enemyAttack(){

    }

    public enum EnemyClasses {
        VOLDEMORT(300, 50,500),
        BIGTITS(200,300,0);

        private final int stamina;
        private final int strength;
        private final int intellect;

        EnemyClasses (int stamina,int strength,int intellect) {
            this.stamina = stamina;
            this.strength = strength;
            this.intellect = intellect;
        }

        public int getStamina() {
            return stamina;
        }

        public int getStrength() {
            return strength;
        }

        public int getIntellect() {
            return intellect;
        }
    }

}
