package java_02.quiz5;

public class ChildExample {
    public static void main(String[] args) {
        Parent parent = new Child(); // 자동타입 변환

        parent.field1 = "data1";
        parent.method1(); // 부모 객체에 선언된 메소드
        parent.method2(); // 오버라이드 된 메소드로, 자식 객체의 메소드가 실행된다.

        // 자식 객체에 선언된 필드와 메소드에는 접근할 수 없다. 사용하고 싶다면 강제타입변환 필요
        /*
        parent.field2 = "data2"; //(불가능)
        parent.method3(); //(불가능)
        */
    }
}
