package Chpater2.ch08;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.weight = 70;
        person.age = 29;
        person.gender = "남성";
        person.height = 175;
        person.name = "taeheoki";

        person.showPersonInfo();
    }
}
