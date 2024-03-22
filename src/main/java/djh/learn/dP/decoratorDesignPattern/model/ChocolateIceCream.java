package djh.learn.dP.decoratorDesignPattern.model;

import djh.learn.dP.decoratorDesignPattern.decorator.IceCream;
import djh.learn.dP.decoratorDesignPattern.decorator.IceCreamDecorator;

public class ChocolateIceCream extends IceCreamDecorator {

    public ChocolateIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        System.out.println("Adding Chocolate IceCream to Basic IceCream");
        return 25 + super.cost();
    }
}
