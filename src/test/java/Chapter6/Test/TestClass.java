package Chapter6.Test;

import java.util.ArrayList;

public class TestClass<T> {
    public static void main(String[] args) {
        ArrayList var1 = new ArrayList(); // 제네릭이 사라졌다
        var1.add(1);
        var1.add(2);
        int var2 = (Integer)var1.get(0); // 형변환이 추가되었다
        int var3 = (Integer)var1.get(1); // 형변환이 추가되었다
    }
}
