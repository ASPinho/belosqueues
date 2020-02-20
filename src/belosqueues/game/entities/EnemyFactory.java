package belosqueues.game.entities;

public class EnemyFactory {

    public static Enemy newEnemy (Enemy.EnemyClasses enemyClasses) {
        if (enemyClasses == Enemy.EnemyClasses.BIGTITS) {
            return new BigTits(enemyClasses);
        }
        return new Voldemort(enemyClasses);
    }
}
