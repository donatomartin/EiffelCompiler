// Generated with VGen 2.0.0

package compiler.ast;

public class Position {

    public Position(int line, int column) {
        this.line = line;
        this.column = column;
    }

    public int getLine() {
        return line;
    }

    public int getColumn() {
        return column;
    }

    public boolean lessThan(Position other) {
        return line < other.getLine() || (line == other.getLine() && column < other.getColumn());
    }

    public boolean greaterThan(Position other) {
        return line > other.getLine() || (line == other.getLine() && column > other.getColumn());
    }

    @Override
    public String toString() {
        return line + ":" + column;
    }

    private int line, column;
}
