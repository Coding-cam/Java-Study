package exeFile.실습코드.혜원.ch06;

import java.sql.SQLOutput;

class MyMath2{
    long a,b;

    long add() {
        long result = a + b;
        return result;
    }

    long subtract() {
        return a - b;
    }

    long multiply() {
        return a * b;
    }

    double divide() {
        return a / b;
    }

    static long add(long a, long b) {
        long result = a + b;
        return result;
    }

    static long subtract(long a, long b) {
        return a - b;
    }

    static long multiply(long a, long b) {
        return a * b;
    }

    static double divide(double a, double b) {
        return a / b;
    }
}
public class MyMathTest2 {
    public static void main(String[] args) {
        System.out.println(MyMath2.add(200L,100L));
        System.out.println(MyMath2.subtract(200L,100L));
        System.out.println(MyMath2.multiply(200L,100L));
        System.out.println(MyMath2.divide(200L,100L));

        MyMath2 mm = new MyMath2();
        mm.a=200L;
        mm.b=100L;
        System.out.println(mm.add());
        System.out.println(mm.subtract());
        System.out.println(mm.multiply());
        System.out.println(mm.divide());
    }
}
