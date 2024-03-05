package java_01.quiz5;

public class Quiz05 {
    public static void main(String[] args) {
        String strVar1 = "홍길동";
        String strVar2 = "홍길동";

        if(strVar1 == strVar2) {
            System.out.println("strVar1과 strVar2는 같은 주소를 참조");
        } else {
            System.out.println("strVar1과 strVar2는 다른 주소를 참조");
        }
        if(strVar1.equals(strVar2)) {
            System.out.println("strVar1과 strVar2는 값이 같다.");
        }
    }
}
