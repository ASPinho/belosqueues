package belosqueues.game.equipments.staves;

import belosqueues.game.equipments.Equipment;
import belosqueues.game.equipments.EquipmentDecorator;

public class StarterStaff implements Equipment {

    @Override
    public int getStamina() {
        return 5;
    }

    @Override
    public int getStrength() {
        return 0;
    }

    @Override
    public int getIntellect() {
        return 20;
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
