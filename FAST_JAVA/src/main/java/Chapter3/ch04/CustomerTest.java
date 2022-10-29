package Chapter3.ch04;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer(10010, "이순신");
        customerLee.bonusPoint = 1000;
        int price = customerLee.calcPrice(1000);
        System.out.println(customerLee.showCustomerInfo() + " 가격 : " + price);


        Customer customerKim = new VIPCustomer(10020, "김유신");
        customerKim.bonusPoint = 10000;
        price = customerKim.calcPrice(1000);
        System.out.println(customerKim.showCustomerInfo() + " 가격 : " + price);

//        Customer vc = new VIPCustomer(12345, "no-name");
    }
}
