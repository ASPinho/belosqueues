package belosqueues.game.entities;

public class Voldemort extends Enemy{

    public Voldemort(EnemyClasses enemyClasses) {
        super(enemyClasses.getStrength(),enemyClasses.getStamina(),enemyClasses.getIntellect());
    }
}
