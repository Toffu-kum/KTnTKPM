package structural.decorator.clc_beverage;

import structural.decorator.clc_beverage.Beverage;
import structural.decorator.clc_beverage.CondimentDecorator;

public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int cost() {
        return 4 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }
}
