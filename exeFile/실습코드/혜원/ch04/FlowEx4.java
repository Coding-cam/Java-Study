package exeFile.실습코드.혜원.ch04;

import java.util.Scanner;

public class FlowEx4 {
    public static void main(String args[]) {
        int score = 0;
        char grade = ' ';

        System.out.print("정수를 입렵하세요>");
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        System.out.println("당신의 학점은 이거임 ㅎㅎ :" + grade);
    }
}
