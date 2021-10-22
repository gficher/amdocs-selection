package com.gficher.amdocs;

public class Rover {
    private Coordinate coord;


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


    public Coordinate getCoordinate() {
        return this.coord;
    }


    @Override
    public String toString() {
        return "Rover{" +
                coord +
                '}';
    }
}
