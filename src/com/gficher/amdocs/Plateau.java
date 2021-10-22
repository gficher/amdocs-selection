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


    @Override
    public String toString() {
        return "Plateau{" +
                "xSize=" + xSize +
                ", ySize=" + ySize +
                ", roverList=" + roverList +
                '}';
    }
}
