package belosqueues.game;

public enum MenuOptions {
    EXPLORATION(1),
    CRAFT(2),
    BATTLE(3),
    QUIT(4);

    private int option;

    MenuOptions(int option){
        this.option = option;
    }

    public int getOption(){
        return this.option;
    }
}
