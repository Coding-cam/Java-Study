package exeFile.실습코드.혜원.ch02;

public class FloatEx1 {
    public static void main(String[] args) {
        float f = 9.12345678901234567890f;
        float f2 = 1.2345678901234567890f;
        double d = 9.12345678901234567890d;

        System.out.printf("     123456789012345678901234%n");   //     123456789012345678901234
        System.out.printf("f   : %f%n", f);                     //f   : 9.123457
        System.out.printf("f   : %24.20f%n", f);                //f   :   9.12345695495605500000
        System.out.printf("f2  : %24.20f%n", f2);               //f2  :   1.23456788063049320000
        System.out.printf("d   : %24.20f%n", d);                //d   :   9.12345678901234600000
        // 24자리중 20자리는 소수점 이하의 수를 출력하라는 뜻
        // 근데 저장공간의 한계로 오차가 발생하여 뒤에 0000이 들어가게 된 것이다.

    }
}
