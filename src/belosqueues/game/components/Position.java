package belosqueues.game.components;

import java.util.Objects;

public class Position {

    private int col;
    private int row;

    public Position(int col, int row){
        this.col = col;
        this.row = row;
    }
    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public void moveCol(int dif){
        this.col += dif;
    }

    public void moveRow(int dif){
        this.row += dif;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return col == position.col &&
                row == position.row;
    }

    @Override
    public int hashCode() {
        return Objects.hash(col, row);
    }
}
