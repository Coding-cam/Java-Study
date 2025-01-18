package exeFile.실습코드.서연.Ch4;

import java.util.Scanner;

public class FlowEx7 {
    public static void main(String[] args) {
        System.out.println("1,2,3 (가위 바위 보) 중 하나 입력");
        Scanner sc = new Scanner(System.in);
        int user = sc.nextInt();
        int com = (int)(Math.random() * 3) +1;

        System.out.println("당신은 " + user);
        System.out.println("com " + com);

        switch (user-com){
            case 2: case -1:
                System.out.println("졌다");
                break;
            case 1: case -2:
                System.out.println("이겼다");
                break;
            case 0:
                System.out.println("비겼따");
                break;
        }
    }
}
