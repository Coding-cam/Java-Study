package exeFile.실습코드.서연.Ch4;

import java.util.Scanner;

public class FlowEx4 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ';

        System.out.println("점수 입력");
        Scanner sc = new Scanner(System.in);
        score = sc.nextInt();

        if (score >= 90 ){
            grade = 'A';
        } else if (score >=80){
            grade = 'B';
        }else if (score >=70){
            grade = 'C';
        } else {
            grade = 'D';
        }
        System.out.println(grade + "학점 임");
    }
}
