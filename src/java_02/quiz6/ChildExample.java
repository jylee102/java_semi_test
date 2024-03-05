package java_02.quiz6;

import java_02.quiz5.Child;
import java_02.quiz5.Parent;

public class ChildExample {
    public static void main(String[] args) {
        Parent parent = new Child(); // 자동타입 변환

        parent.field1 = "data1";
        parent.method1(); // 부모 객체에 선언된 메소드
        parent.method2(); // 오버라이드 된 메소드로, 자식 객체의 메소드가 실행된다.

        Child parent1 = (Child) parent;
        parent1.field2 = "data2";
        parent1.method3();
    }
}
