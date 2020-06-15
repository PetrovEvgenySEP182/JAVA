package org.step.exercise2.models.classes;

import java.util.HashMap;
import java.util.Map;

public class Employee {

    private String name;
    private Map<Product, Integer> products;

    public Employee(String name) {
        this(name, new HashMap<Product, Integer>());
    }

    public Employee(String name, Map<Product, Integer> products) {
        setName(name);
        setProducts(products);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    public void setProducts(Map<Product, Integer> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        StringBuilder tmp = new StringBuilder("Name: " + name + "\n");

        for(Map.Entry<Product, Integer> val : products.entrySet()){
            tmp.append(val.getKey().getName()).append(" - ")
                    .append(val.getValue()).append("шт. - ")
                    .append(val.getKey().getCost()).append("тг.\n");
        }

        return tmp.toString();
    }

    public int getTotalCost(){
        int result = 0;
        for(Map.Entry<Product, Integer> val : products.entrySet()){
            result += val.getKey().getCost() * val.getValue();
        }
        return result;
    }
}
