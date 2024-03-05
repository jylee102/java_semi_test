package java_01.quiz2;

public class Quiz02 {
    public static void main(String[] args) {
        int v8 = 10;
        double result5 = v8 / 4; // int형끼리의 연산결과는 int이므로 2로 계산된 후 자동타입 변환되기 때문에
        double result6 = v8 / (double) 4; // 모두 int형인 피연산자들 중 하나를 double형으로 바꾸면 2.2로 출력
        System.out.println(result5);
        System.out.println(result6);
    }
}
