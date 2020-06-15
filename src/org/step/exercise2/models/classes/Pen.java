package org.step.exercise2.models.classes;

public class Pen extends Product{

    private double amountPaste;

    public Pen(String name) {
        this(name, 0, 100d);
    }

    public Pen(String name, double amountPaste) {
        this(name, 0, amountPaste);
    }

    public Pen(String name, int cost, double amountPaste) {
        super(name, cost);
        setAmountPaste(amountPaste);
    }

    public double getAmountPaste() {
        return amountPaste;
    }

    public void setAmountPaste(double amountPaste) {
        this.amountPaste = amountPaste;
    }

    @Override
    public String toString() {
        return super.toString() + " - Paste: " + getAmountPaste() + "\n";
    }
}
