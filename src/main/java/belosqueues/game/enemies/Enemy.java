package belosqueues.game.enemies;


import static belosqueues.game.Game.*;
import belosqueues.game.components.Position;


public abstract class Enemy {

    //graphic && logic representation
    protected Position pos;

    //Player attributes
    protected int stamina;
    protected int strength;
    protected int intellect;

    public Enemy (EnemyClasses enemyClass){
        stamina = enemyClass.stamina;
        strength = enemyClass.strength;
        intellect = enemyClass.intellect;
        pos = new Position(10,4);
    }

    public void enemyAttack(){

    }

    public void moveUp(){
        pos.moveRow(-1);
    }

    public void moveDown(){
        pos.moveRow(1);
    }

    public void moveLeft(){
        pos.moveCol(-1);
    }

    public void moveRight(){
        pos.moveCol(1);
    }

    public Position getPos() {
        return pos;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int staminaRemoved) {
        stamina -= staminaRemoved;
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
