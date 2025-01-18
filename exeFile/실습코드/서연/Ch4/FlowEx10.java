package exeFile.실습코드.서연.Ch4;

import java.util.Scanner;

public class FlowEx10 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ';

        System.out.println("점수 입력 ");

        Scanner sc = new Scanner(System.in);
        String tmp = sc.nextLine();
        score = Integer.parseInt(tmp);

        switch (score / 10) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            default:
                grade = 'F';
        }
        System.out.println("당신은 " + grade);
    }
}
