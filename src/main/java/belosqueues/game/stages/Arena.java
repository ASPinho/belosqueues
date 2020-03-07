package belosqueues.game.stages;

import belosqueues.game.player.Player;
import belosqueues.game.enemies.Enemy;

public class Arena {

    private Player player;
    private Enemy enemy;
    Player.PlayerClasses playerClasses;

    private int attack = 30;

    public Arena(Player player, Enemy enemy){

        this.player = player;
        this.enemy = enemy;

    }

    public void encounter(){
        if (player.getPos() == enemy.getPos()){
            startBattle();
        }
    }

    public void startBattle(){

        System.out.println("The battle is starting!");

        if (player.getStamina() == 0) {
            System.out.println("You Lost");
        }

        if (enemy.getStamina() == 0) {
            System.out.println("Enemy died");
        }

        while (player.getStamina() > 0 && enemy.getStamina() > 0) {

            int attackTurn = (int) Math.ceil(Math.random() * 2);
            System.out.println("attackTurn = " + attackTurn);

            int attackT = (attackTurn == 1) ? attackPlayer() : attackEnemy();

        }


    }

    public int attackEnemy(){

        enemy.setStamina(attack);
        System.out.println("Enemy lost " + attack + " Stamina.\nCurrent Stamina: " + enemy.getStamina() + "\n");



       return enemy.getStamina() - attack;

    }

    public int attackPlayer(){

        player.setStamina(attack);
        System.out.println("Player lost " + attack + " Stamina.\nCurrent Stamina: " + player.getStamina() + "\n");

        return player.getStamina() - attack;

    }

}
