package org.step.exercise1;

import org.step.exercise1.models.Pen;

public class Main {
    public static void main(String[] args) {

        Pen objA = new Pen("Abc");
        Pen objB = new Pen("CBa");
        Pen objC = new Pen("Pen", 55f);
        System.out.println(objA);
        System.out.println(objA == objB);
        System.out.println(objA.hashCode());
        System.out.println(objB.hashCode());
        System.out.println(objC.hashCode());
    }
}
