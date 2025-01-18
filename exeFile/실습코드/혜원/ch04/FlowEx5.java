package exeFile.실습코드.혜원.ch04;

import java.util.Scanner;

public class FlowEx5 {
    public static void main(String args[]) {
        int score = 0;
        char grade = ' ', opt = ' ';

        System.out.print("정수를 입력해주세요 >");

        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();

        System.out.println("당신의 점수는 이것입니다.:" + score);

        if (score >= 90) {
            grade = 'A';
            if (score >= 98) {
                opt = '+';
            } else if (score < 94) {
                opt = '-';
            }
        } else if (score >= 80) {
            grade = 'B';
            if (score >= 88) {
                opt = '+';
            } else if (score < 84) {
                opt = '-';
            }
        } else {
            grade = 'C';
        }

        System.out.println("당신의 학점은 :" + grade + opt);

    }

}
