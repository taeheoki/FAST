package Chapter4.ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c = Class.forName("java.lang.String");

        Constructor[] constructors = c.getConstructors();
        for (Constructor con : constructors) {
            System.out.println(con);
        }
        System.out.println("===================================");
        Method[] methods = c.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
    }
}
