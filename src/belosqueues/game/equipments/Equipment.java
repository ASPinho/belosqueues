package belosqueues.game.equipments;

public interface Equipment {

    public abstract int getStamina();

    public abstract int getStrength();

    public abstract int getIntellect();

    public abstract int getArmor();

    public abstract Type getType();

    public enum Type{
        BOOTS,
        CHEST,
        GLOVES,
        HELM,
        PANTS,
        WEAPON,
    }

}
