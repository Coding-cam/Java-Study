package exeFile.실습코드.혜원.ch04;

import java.util.Scanner;

public class FlowEx27 {
    public static void main(String args[]) {
        int num;
        int sum = 0;
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println("합계 구할 숫자 입력. 끝내려면 0 입력");
        while (flag) {
            System.out.println(">>");

            String tmp = scanner.nextLine();
            num = Integer.parseInt(tmp);

            if (num != 0) {
                sum += num;
            } else {
                flag = false;
            }
        }

        System.out.println("합계 :" + sum);
    }
}
