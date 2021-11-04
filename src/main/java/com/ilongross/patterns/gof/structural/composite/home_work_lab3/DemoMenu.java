package com.ilongross.patterns.gof.structural.composite.home_work_lab3;

import com.ilongross.patterns.gof.structural.composite.home_work_lab3.meals.Lunch;
import com.ilongross.patterns.gof.structural.composite.home_work_lab3.menu_items.Cocktail;
import com.ilongross.patterns.gof.structural.composite.home_work_lab3.menu_items.IceCream;
import com.ilongross.patterns.gof.structural.composite.home_work_lab3.menu_items.Pizza;
import com.ilongross.patterns.gof.structural.composite.home_work_lab3.menu_items.Tiramisu;
import com.ilongross.patterns.gof.structural.composite.home_work_lab3.products.*;

public class DemoMenu {
    public static void main(String[] args) {

        var apple = new Apple(95);
        var cheese = new Cheese(363);
        var chocolate = new Chocolate(250);
        var milk = new Milk(60);
        var orange = new Orange(45);
        var pastry = new Pastry(100);
        var tomato = new Tomato(22);

        var cocktail = new Cocktail(apple, apple, orange);
        System.out.println(cocktail);

        var iceCream = new IceCream(milk, chocolate, orange);
        System.out.println(iceCream);

        var pizza = new Pizza(pastry, pastry, pastry, tomato, tomato, cheese, cheese, milk, milk);
        System.out.println(pizza);

        var tiramisu = new Tiramisu(cheese, milk, chocolate, chocolate);
        System.out.println(tiramisu);

        var lunch = new Lunch(pizza, tiramisu, cocktail, orange);
        System.out.println(lunch);

    }
}
