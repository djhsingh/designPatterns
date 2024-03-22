package djh.learn.dP.decoratorDesignPattern.model;

import djh.learn.dP.decoratorDesignPattern.decorator.IceCream;
import djh.learn.dP.decoratorDesignPattern.decorator.IceCreamDecorator;

public class VanillaIceCream extends IceCreamDecorator {
    public VanillaIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        System.out.println("Adding Vanilla IceCream to Basic IceCream");
        return 15 + super.cost();
    }
}
