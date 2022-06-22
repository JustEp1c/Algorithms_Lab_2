package com.stack;

public class Arc {

    private final int weight;
    private final String vertex1;
    private final String vertex2;

    public Arc(int weight, String vertex1, String vertex2) {
        this.weight = weight;
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
    }

    public int getWeight() {
        return weight;
    }

    public String getVertex1() {
        return vertex1;
    }

    public String getVertex2() {
        return vertex2;
    }
}
