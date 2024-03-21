package strategyDesignPattern2;

public class PayPalAlgorithm implements Payment{
    private String email;
    private String password;

    public PayPalAlgorithm(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount+" INR paid with PayPal");
    }
}
