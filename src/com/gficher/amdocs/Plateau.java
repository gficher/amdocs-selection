package com.gficher.amdocs;

import java.util.ArrayList;

public class Plateau {
    private int xSize;
    private int ySize;

    private ArrayList<Rover> roverList = new ArrayList<>();


    Plateau(int xSize, int ySize) {
        this.xSize = xSize;
        this.ySize = ySize;
    }


    public ArrayList<Rover> getRoverList() {
        return this.roverList;
    }

    public Rover deployRover(Coordinate coord) {
        Rover newRover = new Rover(coord);

        this.roverList.add(newRover);

        return newRover;
    }

    public boolean hasRoverInCoordinate(Coordinate coord) {
        for (Rover rover : roverList) {
            if (coord.hasSameCoordinate(rover.getCoordinate())) {
                return true;
            }
        }
        return false;
    }

    public boolean isCoordWithinBounds(Coordinate coord) {
        // Check X coordinate
        if (coord.getX() < 0) return false;
        if (coord.getX() > this.xSize) return false;

        // Check Y coordinate
        if (coord.getY() < 0) return false;
        if (coord.getY() > this.ySize) return false;

        return true;
    }


    @Override
    public String toString() {
        return "Plateau{" +
                "xSize=" + xSize +
                ", ySize=" + ySize +
                ", roverList=" + roverList +
                '}';
    }
}
