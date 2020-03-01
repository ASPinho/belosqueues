package belosqueues.game.player;

import static belosqueues.game.Game.*;
import belosqueues.game.components.Position;
import belosqueues.game.enemies.Enemy;
import belosqueues.game.equipments.Equipment;
import belosqueues.game.equipments.boots.Boots;
import belosqueues.game.equipments.boots.StarterBoots;
import belosqueues.game.equipments.chest.Chest;
import belosqueues.game.equipments.chest.StarterChest;
import belosqueues.game.equipments.gloves.Gloves;
import belosqueues.game.equipments.gloves.StarterGloves;
import belosqueues.game.equipments.helm.Helm;
import belosqueues.game.equipments.helm.StarterHelm;
import belosqueues.game.equipments.pants.Pants;
import belosqueues.game.equipments.pants.StarterPants;
import belosqueues.game.equipments.staves.StarterStaff;
import belosqueues.game.equipments.swords.StarterSword;
import belosqueues.game.equipments.swords.Sword;
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
    protected Equipment helm = new StarterHelm();
    protected Equipment chest = new StarterChest();
    protected Equipment gloves = new StarterGloves();
    protected Equipment pants = new StarterPants();
    protected Equipment boots = new StarterBoots();
    protected Equipment weapon;

    public Player(PlayerClasses playerClass){
        stamina = playerClass.stamina;
        strength = playerClass.strength;
        intellect = playerClass.intellect;
        weapon = playerClass.weapon;
        pos = new Position(5, 15);
        player = new Rectangle(PADDING + pos.getCol() * CELLSIZE, PADDING + pos.getRow() * CELLSIZE, CELLSIZE, CELLSIZE);
        player.fill();

        //warlockPic = new Picture(player.getX(), player.getY(), "/Users/codecadet/Documents/AndreGoncalves/dev/outside-projects/belosqueues/resources/images/knight-left.png");
        //warlockPic.draw();
    }

    public void equip(Equipment equipment) {

        switch (equipment.getType()) {

            case BOOTS:
                boots = equipment;
                break;

            case CHEST:
                chest = equipment;
                break;

            case GLOVES:
                gloves = equipment;
                break;

            case HELM:
                helm = equipment;
                break;

            case PANTS:
                pants = equipment;
                break;

            case WEAPON:
                weapon = equipment;
                break;
        }
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

    public Equipment getEquipment(Equipment.Type type){

        Equipment equipment = null;

        switch (type){

            case BOOTS:
                equipment = boots;
                break;

            case CHEST:
                equipment = chest;
                break;

            case GLOVES:
                equipment = gloves;
                break;

            case HELM:
                equipment = helm;
                break;

            case PANTS:
                equipment = pants;
                break;

            case WEAPON:
                equipment = weapon;
                break;
        }

        return equipment;

    }

    public void setStamina(int staminaRemoved) {

        stamina -= staminaRemoved;
    }

    public abstract void attack(Enemy enemy);

    public Position getPos() {
        return pos;
    }

    public enum PlayerClasses {
        WARLOCK(170, 20, 200, new StarterStaff()),
        WARRIOR(250, 100, 50, new StarterSword());

        private final int stamina;
        private final int strength;
        private final int intellect;
        private final Equipment weapon;

        PlayerClasses(int stamina, int strength, int intellect, Equipment weapon){
          
            this.stamina = stamina;
            this.strength = strength;
            this.intellect = intellect;
            this.weapon = weapon;
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
