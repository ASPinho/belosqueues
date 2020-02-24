package belosqueues.game.enemies;

import belosqueues.game.player.Player;

public class EnemyFactory {

    public static Enemy newEnemy () {

        int random = (int) (Math.random() * Enemy.EnemyClasses.values().length);
        Enemy.EnemyClasses enemyClass = Enemy.EnemyClasses.values()[random];

            Enemy enemy = null;

            switch (enemyClass) {

                case BIGTITS:
                    enemy = new BigTits();
                case VOLDEMORT:
                    enemy = new Voldemort();
            }

            return enemy;

        /*if (enemyClasses == Enemy.EnemyClasses.BIGTITS) {
            return new BigTits(enemyClasses);
        }
        return new Voldemort(enemyClasses);*/
    }
}
