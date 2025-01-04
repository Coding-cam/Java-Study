package exeFile.객체지향_프로그래밍.혜원.ch02;

public class VarEx2 {
    public static void main(String[] args) {
        int x = 10, y = 20;
        int tmp = 0;

        System.out.println("x:" + x + " y:" + y);   // x:10 y:20

        tmp = x;
        x = y;
        y = tmp;

        System.out.println("x:" + x + " y:" + y);   // x:20 y:10
    }
}
