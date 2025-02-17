package exeFile.실습코드.혜원.ch06;

public class ReferenceParamEx {
    static void change(int[] x) {
        x[0] = 1000;
        System.out.println(x[0]);
    }

    public static void main(String[] args) {
        int[] x = {10};
        System.out.println(x[0]);

        change(x);
        System.out.println(x[0]);
    }
}
