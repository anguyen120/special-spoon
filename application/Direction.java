package application;

/**
 * List of all possible directions in the game of Tetris
 * 
 * (an enum (enumeration) is a convenient way to group constants that are
 * related. It also ensures that all variables of type Direction will have a
 * value equal to one of the constants.)
 * 
 * see https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html
 * 
 * 
 *
 */

public enum Direction {
    RIGHT(1, 0),
    DOWN(0, 1),
    LEFT(-1, 0);

    int x, y;

    Direction(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Direction prev() {
        int nextIndex = ordinal() - 1;
        if (nextIndex == -1) {
            nextIndex = Direction.values().length - 1;
        }
        return Direction.values()[nextIndex];
    }

    public Direction next() {
        int nextIndex = ordinal() + 1;
        if (nextIndex == Direction.values().length) {
            nextIndex = 0;
        }
        return Direction.values()[nextIndex];
    }
}
