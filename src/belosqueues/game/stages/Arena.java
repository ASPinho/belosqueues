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


        while(!player.getIsDead() && !enemy.getIsDead()) {

            int attackTurn = (int) (Math.random() * 2);

            switch(attackTurn) {
                case 0:
                    if(player.getStamina() <= 0) {
                        player.setIsDead();
                        break;
                    }
                    System.out.println("The enemy has attacked you!");
                    attackPlayer();
                    break;
                case 1:
                   if(enemy.getStamina() <= 0){
                        enemy.setIsDead();
                        break;
                    }
                    System.out.println("You have attacked the enemy");
                    attackEnemy();
                    break;
            }

        }


       /* while (player.getStamina() > 0 && enemy.getStamina() > 0 && !player.getIsDead() && !enemy.getIsDead()) {

            if (player.getStamina() <= 0) {
                System.out.println("You Lost");
                player.setIsDead();
                break;
            }

            if (enemy.getStamina() <= 0) {
                System.out.println("Enemy died");
                enemy.setIsDead();
                break;
            }

            int attackTurn = (int) Math.ceil(Math.random() * 2);
            System.out.println("attackTurn = " + attackTurn);

            int attackT = (attackTurn == 1) ? attackPlayer() : attackEnemy();

        }*/





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
