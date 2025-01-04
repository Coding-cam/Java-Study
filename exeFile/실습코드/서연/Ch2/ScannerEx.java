package exeFile.실습코드.서연.Ch2;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수 입력");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);
        System.out.println("입력내용 : "+ input);
        System.out.printf("num=%d%n",num);
    }
}
