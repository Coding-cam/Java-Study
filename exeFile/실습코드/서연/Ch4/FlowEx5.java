package exeFile.실습코드.서연.Ch4;

import java.util.Scanner;

public class FlowEx5 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ',opt = '0';

        System.out.println("점수 입력");
        Scanner sc = new Scanner(System.in);
        score = sc.nextInt();

        System.out.printf("%d 점수", score);

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
        System.out.printf("당신은 %c%c 이다.",grade,opt);
    }
}
