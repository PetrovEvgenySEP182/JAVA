package org.step.exercise2;

import org.step.exercise2.models.classes.Employee;
import org.step.exercise2.models.classes.Pen;
import org.step.exercise2.models.classes.Product;
import org.step.exercise2.models.classes.Ruler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        final int MAX_RAND_COUNT_PRODUCT = 100;
        final int MAX_RAND_COST_FOR_PEN = 200;
        final int MAX_RAND_COST_FOR_RULER = 500;

        Random rand = new Random();
        ArrayList<Pen> pens = new ArrayList<>();
        pens.add(new Pen("Ручка Славита", rand.nextInt(MAX_RAND_COST_FOR_PEN), 100d));
        pens.add(new Pen("Ручка KUBE", rand.nextInt(MAX_RAND_COST_FOR_PEN), 100d));
        pens.add(new Pen("Ручка Obama", rand.nextInt(MAX_RAND_COST_FOR_PEN), 100d));

        ArrayList<Ruler> rulers = new ArrayList<>();
        rulers.add(new Ruler("Линейка SUN", rand.nextInt(MAX_RAND_COST_FOR_RULER), 10));
        rulers.add(new Ruler("Линейка SUN", rand.nextInt(MAX_RAND_COST_FOR_RULER), 20));

        Employee emp1 = new Employee("Продавец 1");

        for(Pen pen : pens){
            emp1.getProducts().put(pen, rand.nextInt(MAX_RAND_COUNT_PRODUCT));
        }

        System.out.println(emp1);
        System.out.println(emp1.getTotalCost());


        List<Product> products = new ArrayList<>();
        products.addAll(pens);
        products.addAll(rulers);

        products.sort(Product.NameComparator);
        System.out.println(products);

        products.sort(Product.CostComparator);
        System.out.println(products);

        Collections.sort(products);
        System.out.println(products);

    }
}
