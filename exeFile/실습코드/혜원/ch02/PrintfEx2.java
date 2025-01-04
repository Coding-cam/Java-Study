package exeFile.실습코드.혜원.ch02;

public class PrintfEx2 {
    public static void main(String[] args) {
        String url = "www.codechobo.com";

        float f1 = .10f;
        float f2 = 1e1f;
        float f3 = 3.14e3f;
        double d = 1.23456789;

        // %e : 지수 표기법
        // %g : 상황에 따라 %e 또는 %f를 자동 선택
        System.out.printf("f1=%f, %e, %g%n", f1, f1, f1);   //f1=0.100000, 1.000000e-01, 0.100000
        System.out.printf("f2=%f, %e, %g%n", f2, f2, f2);   //f2=10.000000, 1.000000e+01, 10.0000
        System.out.printf("f3=%f, %e, %g%n", f3, f3, f3);   //f3=3140.000000, 3.140000e+03, 3140.00

        System.out.printf("d=%f%n", d);         //d=1.234568
        System.out.printf("d=%14.10f%n", d);    //d=  1.2345678900

        System.out.printf("[1234567890]%n");    //[1234567890]
        System.out.printf("[%s]%n", url);       //[www.codechobo.com]
        System.out.printf("[%20s]%n", url);     //[   www.codechobo.com]
        System.out.printf("[-20%s]%n", url);    //[-20www.codechobo.com]
        System.out.printf("[%.8s]%n", url);    //[www.code]
    }
}
