package djh.learn.dP.decoratorDesignPattern.decorator;


public class BasicCream implements IceCream {

    public BasicCream() {
        System.out.println("Creating Basic IceCream");
    }

    @Override
    public double cost() {
        return 5;
    }
}
