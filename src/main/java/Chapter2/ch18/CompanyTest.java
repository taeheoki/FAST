package Chapter2.ch18;

public class CompanyTest {
    public static void main(String[] args) {
        Company company = Company.getInstance();
        Company company2 = Company.getInstance();

        System.out.println(company);
        System.out.println(company2);

//        Calendar calendar = Calendar.getInstance();
    }
}
