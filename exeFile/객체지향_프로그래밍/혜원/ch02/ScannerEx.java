package exeFile.객체지향_프로그래밍.혜원.ch02;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("두 자리 정수를 하나 입력해주세요.>");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);

        System.out.println("입력 내용 :" + input);
        System.out.printf("num=%d%n", num);
    }

}
