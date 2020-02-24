package belosqueues.game.enemies;


import static belosqueues.game.Game.*;
import belosqueues.game.components.Position;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;


public abstract class Enemy {

    //graphic && logic representation
    protected Rectangle enemy;
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
        enemy = new Rectangle(PADDING + pos.getCol() * CELLSIZE, PADDING + pos.getRow() * CELLSIZE, CELLSIZE, CELLSIZE);
        enemy.setColor(Color.RED);
        enemy.fill();
    }

    public void enemyAttack(){

    }

    public void moveUp(){
        pos.moveRow(-1);
        enemy.translate(0, -CELLSIZE);
    }

    public void moveDown(){
        pos.moveRow(1);
        enemy.translate(0, CELLSIZE);
    }

    public void moveLeft(){
        pos.moveCol(-1);
        enemy.translate( -CELLSIZE, 0);
    }

    public void moveRight(){
        pos.moveCol(1);
        enemy.translate(CELLSIZE, 0);
    }

    public Position getPos() {
        return pos;
    }

    public int getStamina() {
        return stamina;
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
