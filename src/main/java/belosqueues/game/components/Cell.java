package belosqueues.game.components;

import belosqueues.game.Game;

public class Cell {

    private Position pos;

    public Cell(Position pos){
        this.pos = pos;
    }

    public Position getPos() {
        return pos;
    }
}
