package com.gficher.amdocs;

public enum CardinalDirections {
    N(0), E(1), S(2), W(3);

    public static final CardinalDirections[] valueList = values();
    public int value;


    CardinalDirections(int value) {
        this.value = value;
    }


    public CardinalDirections next() {
        return valueList[Math.floorMod(this.ordinal() + 1, valueList.length)];
    }

    public CardinalDirections previous() {
        return valueList[Math.floorMod(this.ordinal() - 1, valueList.length)];
    }
}
