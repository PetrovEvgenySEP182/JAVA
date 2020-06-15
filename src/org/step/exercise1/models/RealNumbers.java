package org.step.exercise1.models;

public class RealNumbers {
    public static boolean Compare(float valA, float valB, float eps){
        return Math.abs(valA - valB) < eps;
    }
}
