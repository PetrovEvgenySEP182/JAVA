package org.step.exercise1.models;

public class Pen {

    private String name;
    private float amountPaste;

    public Pen(String name){
        this(name, 100f);
    }

    public Pen(String name, float amountPaste) {
        setName(name);
        setAmountPaste(amountPaste);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(this.getClass() != obj.getClass())
            return false;

        Pen tmp = (Pen) obj;
        float epsilon = 0.0000001f;
        if(!this.getName().equals(tmp.getName()))
            return false;
        else
            return RealNumbers.Compare(this.getAmountPaste(), tmp.getAmountPaste(), epsilon);
    }

    @Override
    public int hashCode() {
        final int multy = 31;
        int result = 1;
        result = multy * result + name.length();
        result = multy * result + (int)amountPaste;
        return result;
    }

    @Override
    public String toString() {
        return "Name:" + getName() + ",AmountOfPaste:" + getAmountPaste();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAmountPaste() {
        return amountPaste;
    }

    public void setAmountPaste(float amountPaste) {
        this.amountPaste = amountPaste;
    }
}
