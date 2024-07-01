package exeFile.객체지향_프로그래밍.서연;

class Tv {
    // 멤버변수
    String color;
    boolean power;
    int channel;

    void power() { power = !power; }
    void channelUp(){ ++channel; }
    void channerDown(){ --channel; }
}

public class TvTest {
    public static void main(String[] args) {
        Tv t;   // 참조변수
        t = new Tv();   // 객체 생성 후 참조변수에 저장
        t.channel = 7;  // 참조변수를 이용하여
        t.channerDown();
        System.out.println(t.channel);

    }
}
