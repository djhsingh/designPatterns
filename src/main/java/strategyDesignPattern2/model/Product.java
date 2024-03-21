package strategyDesignPattern2.model;

public class Product {
    private String upcCode;
    private int price;

    public String getUpcCode() {
        return upcCode;
    }

    public Product(String upcCode, int price) {
        this.upcCode = upcCode;
        this.price = price;
    }

    public void setUpcCode(String upcCode) {
        this.upcCode = upcCode;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
