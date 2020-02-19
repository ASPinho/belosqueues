package belosqueues.game.components;

import belosqueues.game.Game;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Cell {

    private Position pos;
    private Rectangle cell;

    public Cell(Position pos){
        this.pos = pos;
        cell = new Rectangle(Game.PADDING + pos.getCol() * Game.CELLSIZE, Game.PADDING + pos.getRow() * Game.CELLSIZE, Game.CELLSIZE, Game.CELLSIZE);
        cell.draw();
    }

    public Position getPos() {
        return pos;
    }
}
