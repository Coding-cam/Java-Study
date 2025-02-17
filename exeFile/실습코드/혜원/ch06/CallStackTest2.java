package exeFile.실습코드.혜원.ch06;

public class CallStackTest2 {

    static void firstMethod() {
        System.out.println("first 시작");
        secondMathod();
        System.out.println("first 끝");
    }

    static void secondMathod() {
        System.out.println("second 시작");
        System.out.println("secondMathod()");
        System.out.println("second 끝");
    }
    public static void main(String[] args) {
        System.out.println("main 시작");
        firstMethod();
        System.out.println("main 끝");
    }
}
