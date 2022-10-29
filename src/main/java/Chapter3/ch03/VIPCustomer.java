package Chapter3.ch03;

public class VIPCustomer extends Customer {
    double salesRatio;
    String agentID;

    /*public VIPCustomer() {

//        super(); // Customer() 생성자가 정의되어 있지 않다.
        super(0, "no-name");

        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;

        System.out.println("VIPCustomer() call");
    } */

    public VIPCustomer(int customerID, String customerName) {
        super(customerID, customerName);

        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;

        System.out.println("VIPCustomer() call");
    }

    public String getAgentID() {
        return agentID;
    }
}
