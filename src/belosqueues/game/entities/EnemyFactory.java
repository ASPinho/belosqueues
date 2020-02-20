package belosqueues.game.entities;

public class EnemyFactory {

    public static Enemy newEnemy () {

            int random = (int) (Math.random() * 2);
            Enemy empty = null;

            switch (random) {

                case 0:
                    empty = new BigTits(Enemy.EnemyClasses.BIGTITS);
                case 1:
                    empty = new Voldemort(Enemy.EnemyClasses.VOLDEMORT);
            }

            return empty;

        /*if (enemyClasses == Enemy.EnemyClasses.BIGTITS) {
            return new BigTits(enemyClasses);
        }
        return new Voldemort(enemyClasses);*/
    }
}
