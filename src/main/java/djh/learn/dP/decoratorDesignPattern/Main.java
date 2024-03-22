package djh.learn.dP.decoratorDesignPattern;

import djh.learn.dP.decoratorDesignPattern.decorator.BasicCream;
import djh.learn.dP.decoratorDesignPattern.decorator.IceCream;
import djh.learn.dP.decoratorDesignPattern.decorator.IceCreamDecorator;
import djh.learn.dP.decoratorDesignPattern.model.ChocolateIceCream;
import djh.learn.dP.decoratorDesignPattern.model.MintIceCream;
import djh.learn.dP.decoratorDesignPattern.model.VanillaIceCream;

public class Main {
    public static void main(String[] args) {
        IceCream basicCream = new BasicCream();
        System.out.println(basicCream.cost());

        IceCream vanillaIceCream = new VanillaIceCream(basicCream);
        System.out.println(vanillaIceCream.cost());
        IceCream chocolateIceCream = new ChocolateIceCream(basicCream);
        System.out.println(chocolateIceCream.cost());

        IceCream chocolateIceCream2 = new ChocolateIceCream(vanillaIceCream);
        System.out.println(chocolateIceCream2.cost());

        IceCream mintIceCream = new MintIceCream(basicCream);
        System.out.println(mintIceCream.cost());

        IceCream mintIceCream2 = new MintIceCream(chocolateIceCream2);
        System.out.println(mintIceCream2.cost());


    }
}