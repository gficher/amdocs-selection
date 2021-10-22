package com.gficher.amdocs;

public class Coordinate {
    private int x;
    private int y;
    private CardinalDirections direction = CardinalDirections.N;

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public CardinalDirections getDirection() {
        return this.direction;
    }


    Coordinate() {
        this.x = 0;
        this.y = 0;
    }

    Coordinate(int x, int y) {
        this.x = 0;
        this.y = 0;
    }

    Coordinate(int x, int y, CardinalDirections direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }


    public void rotateRight() {
        this.direction = this.direction.next();
    }

    public void rotateLeft() {
        this.direction = this.direction.previous();
    }

    public void moveForward() {
        switch (this.direction) {
            case N:
                this.y++;
                break;
            case E:
                this.x++;
                break;
            case S:
                this.y--;
                break;
            case W:
                this.x--;
                break;
        }
    }


    public boolean hasSameCoordinate(Coordinate coord) {
        return this.x == coord.x && this.y == coord.y;
    }

    public String getFormattedCoords() {
        return this.x + " " + this.y + " " + this.direction;
    }

    public Coordinate getClone() {
        return new Coordinate(this.x, this.y, this.direction);
    }


    @Override
    public String toString() {
        return "(" +
                x +
                "," + y +
                "," + direction +
                ')';
    }
}
