package exeFile.실습코드.서연.Ch3;

import java.util.Scanner;

public class OperatorEx25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = ' ';

        System.out.printf("문자를 하나 입력하세요.>");

        String input = sc.nextLine();
        ch = input.charAt(0);

        if ('0'<= ch && ch <='9'){
            System.out.printf("숫자 입 력 %n");
        }
        if (('a'<=ch && ch <='z') || ('A'<= ch && ch <='Z')){
            System.out.printf("문자 입력 %n");
        }
    }
}
