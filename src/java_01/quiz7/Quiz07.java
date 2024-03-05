package java_01.quiz7;

public class Quiz07 {
    public static void main(String[] args) {
        int[] arrays = {90, 87, 50, 65, 20};

        int min = arrays[0];

        for (int num : arrays) {
            if (num < min) min = num;
        }

        System.out.println("최솟값: " + min);
    }
}
