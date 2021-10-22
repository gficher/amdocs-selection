package com.gficher.amdocs;

public class Rover {
    private Coordinate coord = null;


    Rover(Coordinate coord) {
        this.coord = coord;
    }


    public void rotateRight() {
        this.coord.rotateRight();
    }

    public void rotateLeft() {
        this.coord.rotateLeft();
    }

    public void moveForward() {
        this.coord.moveForward();
    }


    public String getFormattedCoords() {
        return this.coord.getX() + " " + this.coord.getY() + " " + this.coord.getDirection();
    }


    @Override
    public String toString() {
        return "Rover{" +
                coord +
                '}';
    }
}
