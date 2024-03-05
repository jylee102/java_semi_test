package java_02.quiz3;

public class Marine {
    int x = 0, y = 0; // Marine의 위치좌표(x,y)
    int hp = 60; // 현재 체력
    static int weapon = 6; // 공격력
    static int armor = 0; // 방어력
    void weaponUp() {
        weapon++;
    }
    void armorUp() {
        armor++;
    }
    void move(int x, int y) {
        this.x = x; // this.x는 인스턴스 변수, x는 지역변수
        this.y = y; // this.y는 인스턴스 변수, y는 지역변수
    }

    // 정적 멤버는 메소드 영역에 저장되어 메모리가 로딩될 때 실행되는 멤버로, 전역에 영향을 미친다.
    // 따라서 동시에 모든 객체에게 적용되어야 할 항목들에 static을 붙여야 한다.
    // 방어력과 공격력이 함께 올라야 하므로 weapon과 armor 필드를 정적멤버로 만든다.
    // 이렇게 된다면 Marine들이 각자 흩어져서 싸우다가 누군가 스탯이 오른다면 다같이 오르는 프로그램이 된다.

    // 참고로 static 블록이나 메소드 안에서 인스턴스 멤버는 사용할 수 없어 객체 생성 후 사용해야 한다.

    public static void main(String[] args) {
        Marine marine1 = new Marine();
        Marine marine2 = new Marine();
        Marine marine3 = new Marine();

        printMarinesStatus();
        marine1.weaponUp();
        printMarinesStatus();
        marine2.weaponUp();
        printMarinesStatus();
        marine3.armorUp();
        printMarinesStatus();
    }

    public static void printMarinesStatus() {
        System.out.println("marine들 | 공격력: " + Marine.weapon + ", 방어력: " + Marine.armor);
    }
}
