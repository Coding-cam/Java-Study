package exeFile.실습코드.서연.Ch4;

import java.util.Scanner;

public class FlowEx6 {
    public static void main(String[] args) {
        System.out.println("현재 월 입력");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        switch(month){
            case 3:
            case 4:
            case 5:
                System.out.println("봄입니다.");
                break;
            case 6: case 7: case 8:
                System.out.println("여름");
                break;
            default:
            case 12: case 1: case 2:
                System.out.println("겨울");
        }
    }
}
