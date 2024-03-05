package java_01.quiz6;

public class Quiz06 {
    public static void main(String[] args) {
        int[] scores = {83, 90, 87};

        int sum = 0;
        for (int score : scores) {
            sum += score;
        }

        System.out.println("배열의 총합: " + sum);
        System.out.println("배열의 평균: " + (double)sum / scores.length);
    }
}
