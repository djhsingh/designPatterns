package djh.learn.dP.decoratorDesignPattern.model;

import djh.learn.dP.decoratorDesignPattern.decorator.IceCream;
import djh.learn.dP.decoratorDesignPattern.decorator.IceCreamDecorator;

public class MintIceCream extends IceCreamDecorator {
    public MintIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        System.out.println("Adding Mint IceCream to Basic IceCream");
        return 35 + super.cost();
    }
}
