package java_01.quiz3;

public class Quiz03 {
    public static void main(String[] args) {
        int answer = 0;
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) answer += i;
        }
        System.out.println(answer);
    }
}
