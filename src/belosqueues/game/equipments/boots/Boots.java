package belosqueues.game.equipments.boots;

import belosqueues.game.equipments.Equipment;
import belosqueues.game.equipments.EquipmentDecorator;

public class Boots extends EquipmentDecorator {

    public Boots(Equipment equipment){
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
