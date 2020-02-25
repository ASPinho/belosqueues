package belosqueues.game.equipments.pants;

import belosqueues.game.equipments.Equipment;
import belosqueues.game.equipments.EquipmentDecorator;

public class Pants extends EquipmentDecorator {

    public Pants(Equipment equipment){
        super(equipment);
    }

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
        return 0;
    }
}
