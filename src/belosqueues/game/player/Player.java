package belosqueues.game.player;

import static belosqueues.game.Game.*;
import belosqueues.game.components.Position;
import belosqueues.game.enemies.Enemy;
import belosqueues.game.equipments.Equipment;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;


public abstract class Player {

    //graphic && logic representation
    protected Rectangle player;
    protected Position pos;

    //Player attributes
    protected int stamina;
    protected int strength;
    protected int intellect;
    protected int armor;
    protected int experience;
    protected Picture warlockPic;

    //Player equipments
    protected Equipment helm;
    protected Equipment chest;
    protected Equipment gloves;
    protected Equipment pants;
    protected Equipment boots;

    public Player(PlayerClasses playerClass){
        stamina = playerClass.stamina;
        strength = playerClass.strength;
        intellect = playerClass.intellect;
        pos = new Position(5, 15);
        player = new Rectangle(PADDING + pos.getCol() * CELLSIZE, PADDING + pos.getRow() * CELLSIZE, CELLSIZE, CELLSIZE);
        player.fill();

        //warlockPic = new Picture(player.getX(), player.getY(), "/Users/codecadet/Documents/AndreGoncalves/dev/outside-projects/belosqueues/resources/images/knight-left.png");
        //warlockPic.draw();
    }

    public void moveUp(){
        pos.moveRow(-1);
        player.translate(0, -CELLSIZE);
    }

    public void moveDown(){
        pos.moveRow(1);
        player.translate(0, CELLSIZE);
    }

    public void moveLeft(){
        pos.moveCol(-1);
        player.translate( -CELLSIZE, 0);
    }

    public void moveRight(){
        pos.moveCol(1);
        player.translate(CELLSIZE, 0);
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int staminaRemoved) {

        stamina -= staminaRemoved;
    }

    public abstract void attack(Enemy enemy);

    public Position getPos() {
        return pos;
    }

    public enum PlayerClasses {
        WARLOCK(170, 20, 200),
        WARRIOR(250, 100, 50);

        private final int stamina;
        private final int strength;
        private final int intellect;

        PlayerClasses(int stamina, int strength, int intellect){
          
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
