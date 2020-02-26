package belosqueues.game.equipments.swords;

import belosqueues.game.equipments.Equipment;
import belosqueues.game.equipments.EquipmentDecorator;

public class StarterSword implements Equipment {

    @Override
    public int getStamina() {
        return 5;
    }

    @Override
    public int getStrength() {
        return 10;
    }

    @Override
    public int getIntellect() {
        return 0;
    }

    @Override
    public int getArmor() {
        return 0;
    }

    @Override
    public Type getType() {
        return Type.WEAPON;
    }

}
