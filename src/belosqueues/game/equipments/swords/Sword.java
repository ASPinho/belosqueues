package belosqueues.game.equipments.swords;

import belosqueues.game.equipments.Equipment;
import belosqueues.game.equipments.EquipmentDecorator;

public class Sword extends EquipmentDecorator {

    public Sword(Equipment equipment){
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
