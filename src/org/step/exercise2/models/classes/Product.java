package org.step.exercise2.models.classes;

import java.util.Comparator;

public class Product implements Comparable<Product>{

    private String name;
    private int cost;

    public Product(String name) {
        this(name, 0);
    }

    public Product(String name, int cost) {
        setName(name);
        setCost(cost);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + " - cost: " + getCost();
    }

    public int compareTo(Product obj){
        int tmp = this.getName().compareTo(obj.getName());
        if(tmp == 0)
            tmp = this.getCost() - obj.getCost();
        return tmp;
    }

    public static Comparator<Product> NameComparator = new Comparator<Product>() {
        @Override
        public int compare(Product o1, Product o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };

    public static Comparator<Product> CostComparator = new Comparator<Product>() {
        @Override
        public int compare(Product o1, Product o2) {
            return o1.getCost() - o2.getCost();
        }
    };

}
