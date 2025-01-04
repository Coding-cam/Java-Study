package exeFile.객체지향_프로그래밍.혜원.ch02;

public class FloatToBinEx {
    public static void main(String[] args) {
        float f = 9.1234567f;
        int i = Float.floatToIntBits(f);

        System.out.printf("%f%n", f);   //9.123457
        System.out.printf("%X%n", i);   //4111F9AE
    }
}
