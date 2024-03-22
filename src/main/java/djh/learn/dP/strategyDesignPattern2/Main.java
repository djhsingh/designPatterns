package djh.learn.dP.strategyDesignPattern2;

import djh.learn.dP.strategyDesignPattern2.model.Product;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ShoppingKart kart = new ShoppingKart();
        Product shirt = new Product("XXL",50);
        Product tShirt = new Product("XL",30);
        kart.addProduct(shirt);
        kart.addProduct(tShirt);
        Payment payment = new CreditCardAlgorithm("Deepak","BPYPD23145");
        kart.pay(payment);

        Payment payment2 = new PayPalAlgorithm("Deepak","5353555");
        kart.pay(payment2);
    }
}