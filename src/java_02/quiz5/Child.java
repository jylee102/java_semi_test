package java_02.quiz5;

public class Child extends Parent {
    public String field2;

    public void method3() {
        System.out.println("Child-method3()");
    }

    @Override
    public void method2() {
        System.out.println("Child-method2()");
    }
}
