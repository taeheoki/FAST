package Chapter2.ch08;

public class Order {
    public String orderNumber;
    public String phoneNumber;
    public String address;
    public int date;
    public int orderTime;
    public int price;
    public String orderIndex;

    public void showOrderInfo() {
        System.out.println("주문 접수 번호 : " + orderNumber);
        System.out.println("주문 핸드폰 번호 : " + phoneNumber);
        System.out.println("주문 집 주소 : " + address);
        System.out.println("주문 날짜 : " + date);
        System.out.println("주문 시간 : " + orderTime);
        System.out.println("주문 가격 : " + price);
        System.out.println("메뉴 번호 : " + orderIndex);
    }
}
