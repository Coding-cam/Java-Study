package exeFile.실습코드.서연.Ch2;

public class FloatToBinEx {
    public static void main(String[] args) {
        float f = 9.12345677f;
        int i = Float.floatToIntBits(f);

        System.out.printf("%f%n", f);
        System.out.printf("%X%n",i);
    }
}
