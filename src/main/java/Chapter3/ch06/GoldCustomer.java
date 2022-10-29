package Chapter3.ch06;

public class GoldCustomer extends Customer {
    double saleRatio;

    public GoldCustomer(int customerID, String customerName) {
        super(customerID, customerName);

        customerGrade = "Gold";
        saleRatio = 0.1;
        bonusRatio = 0.02;
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * saleRatio);
    }
}
