package exeFile.실습코드.혜원.ch06;

public class CallStackTest {
    static void firstMethod() {
        secondMathod();
    }

    static void secondMathod() {
        System.out.println("secondMathod()");
    }

    public static void main(String[] args) {
        firstMethod();
    }
}
