package Chapter2.ch12;

public class Person {
    String name;
    int age;

    public Person() {
//        int i = 0;
//        System.out.println(i);    // 객체가 제대로 만들어지기 전에 코드를 넣을 수 없다.
        this("이름 없음", 1);
        name = "abc";
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showPerson() {
        System.out.println(name + ", " + age);
    }

    public Person getPerson() {
        return this;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.showPerson();

        System.out.println(person);

        Person person2 = person.getPerson();
        System.out.println(person2);
    }
}
