package Chapter2.ch17;

public class Employee {
    public static int getSerialNum() {
        return serialNum;
    }

    public static void setSerialNum(int serialNum) {
        int i = 0;

//        employeeName = "Lee"; // 오류발생

        Employee.serialNum = serialNum;
    }

    private static int serialNum = 1000;
    private int employeeId;
    private String employeeName;
    private String departent;

    public Employee() {
        serialNum++;
        employeeId = serialNum;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDepartent() {
        return departent;
    }

    public void setDepartent(String departent) {
        this.departent = departent;
    }
}
