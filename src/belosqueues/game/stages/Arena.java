package belosqueues.game.stages;

import belosqueues.game.Classes.Player;
import belosqueues.game.Classes.PlayerFactory;
import belosqueues.game.entities.Enemy;
import belosqueues.game.entities.EnemyFactory;

public class Arena {

    private Player player;
    private Enemy enemy;
    Player.PlayerClasses playerClasses;

    private int attack = 30;

    public Arena(){

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

        while (player.getStamina() != 0 || enemy.getStamina() != 0) {

            int attackTurn = (int) Math.random() * 2;

            int attackT = (attackTurn == 1) ? attackPlayer() : attackEnemy();

        }


    }

    public int attackEnemy(){

       return enemy.getStamina() - attack;

    }

    public int attackPlayer(){

        return player.getStamina() - attack;

    }

}
