package com.gficher.amdocs;

public class Coordinate {
    private int x = 0;
    private int y = 0;
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
        this.direction = CardinalDirections.N;
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

    @Override
    public String toString() {
        return "(" +
                x +
                "," + y +
                "," + direction +
                ')';
    }
}
