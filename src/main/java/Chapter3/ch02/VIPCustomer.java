package Chapter3.ch02;

public class VIPCustomer extends Customer {
    double salesRatio;
    String agentID;

    public VIPCustomer() {
        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;
    }

    public String getAgentID() {
        return agentID;
    }
}
