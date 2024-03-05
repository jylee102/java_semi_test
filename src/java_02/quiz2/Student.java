package java_02.quiz2;

public class Student {
    String name = "김철수"; //학생 이름
    int ban = 1; //반
    int no = 10; //번호
    int kor = 90; //국어점수
    int eng = 70; //영어점수
    int math = 85; //수학점수

    @Override
    public String toString() {
        return "이름: " + name + ", 반: " + ban + ", 번호: " + no;
    }

    public int getTotal() {
        return kor + eng + math;
    }
    public double getAverage() {
        return getTotal() / (double) 3;
    }

    public static void main(String[] args) {
        Student student = new Student();

        System.out.println(student);
        System.out.println("점수 합: " + student.getTotal());
        System.out.println("점수 평균: " + student.getAverage());
    }
}
