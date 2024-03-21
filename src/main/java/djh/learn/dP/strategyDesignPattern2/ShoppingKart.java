package djh.learn.dP.strategyDesignPattern2;

import djh.learn.dP.strategyDesignPattern2.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ShoppingKart {
    List<Product> productList;

    public ShoppingKart() {
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product product){
        this.productList.add(product);
    }
    public void remove(Product product){
        this.productList.remove(product);
    }
    public void pay(Payment paymentStrategy){
        int sum = calculateAmount();
        paymentStrategy.pay(sum);
    }
    public int calculateAmount(){
        int sum =0;
        for (Product product: productList){
            sum += product.getPrice();
        }
        return sum;
    }
}
