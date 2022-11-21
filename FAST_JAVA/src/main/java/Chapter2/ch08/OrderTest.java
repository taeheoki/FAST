package Chapter2.ch08;

public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();
        order.orderNumber = "202011020003";
        order.phoneNumber = "01023450001";
        order.address = "서울시 강남구 역삼동 111-333";
        order.date = 20201102;
        order.orderTime = 130258;
        order.price = 35000;
        order.orderIndex = "0003";

        order.showOrderInfo();
    }
}
