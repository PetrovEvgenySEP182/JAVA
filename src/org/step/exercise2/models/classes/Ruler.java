package org.step.exercise2.models.classes;

public class Ruler extends Product {

    private int length;

    public Ruler(String name) {
        this(name, 0, 0);
    }

    public Ruler(String name, int length) {
        this(name, 0, length);
    }

    public Ruler(String name, int cost, int length) {
        super(name, cost);
        setLength(length);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return super.toString() + " - Length: " + getLength() + "\n";
    }
}
