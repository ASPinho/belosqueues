package belosqueues.game.equipments.boots;

import belosqueues.game.equipments.Equipment;

public class StarterBoots implements Equipment {

    @Override
    public int getStamina() {
        return 0;
    }

    @Override
    public int getStrength() {
        return 0;
    }

    @Override
    public int getIntellect() {
        return 0;
    }

    @Override
    public int getArmor() {
        return 10;
    }

    @Override
    public Type getType() {
        return Type.BOOTS;
    }
}
