package exeFile.실습코드.혜원.ch04;

import java.util.Scanner;

public class FlowEx17 {
    public static void main(String args[]) {
        int num = 0;
        System.out.printf("*을 출력할 라인의 수 >");
        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();

        num = Integer.parseInt(tmp);

        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
