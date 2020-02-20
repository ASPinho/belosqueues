package belosqueues.game.Classes;

import belosqueues.game.Game;
import belosqueues.game.components.Position;
import belosqueues.game.entities.Enemy;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

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

    public Player(int stamina, int strength, int intellect){
        this.stamina = stamina;
        this.strength = strength;
        this.intellect = intellect;
        pos = new Position(5, 15);
        player = new Rectangle(Game.PADDING + pos.getCol() * Game.CELLSIZE, Game.PADDING + pos.getRow() * Game.CELLSIZE, Game.CELLSIZE, Game.CELLSIZE);
        player.fill();
    }

    public void moveUp(){
        pos.moveRow(-1);
        player.translate(0, -Game.CELLSIZE);
    }

    public void moveDown(){
        pos.moveRow(1);
        player.translate(0, Game.CELLSIZE);
    }

    public void moveLeft(){
        pos.moveCol(-1);
        player.translate( -Game.CELLSIZE, 0);
    }

    public void moveRight(){
        pos.moveCol(1);
        player.translate(Game.CELLSIZE, 0);
    }

    public abstract void attack(Enemy enemy);

    public Position getPos() {
        return pos;
    }

    public enum PlayerClasses {
        WARLOCK(170, 20, 200),
        WARRIOR(250, 100, 50);

        private final int STAMINA;
        private final int STRENGTH;
        private final int INTELLECT;

        PlayerClasses(int stamina, int strength, int intellect){
            STAMINA = stamina;
            STRENGTH = strength;
            INTELLECT = intellect;
        }

        public int getSTAMINA() {
            return STAMINA;
        }

        public int getSTRENGTH() {
            return STRENGTH;
        }

        public int getINTELLECT() {
            return INTELLECT;
        }
    }
}
