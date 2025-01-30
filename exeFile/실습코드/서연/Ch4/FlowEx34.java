package exeFile.실습코드.서연.Ch4;

import java.util.Scanner;

public class FlowEx34 {
    public static void main(String[] args) {
        int menu =0, num =0;
        Scanner sc = new Scanner(System.in);

        outer:
        while (true) {
            System.out.println("1 square");
            System.out.println("2 square root");
            System.out.println("3 log");
            System.out.println(" 원하는메뉴 선택 , 종료0");

            String tmp = sc.nextLine();
            menu = Integer.parseInt(tmp);

            if(menu==0){
                System.out.println("프로그램 종료합니다.");
                break;
            } else if(!(1<=menu && menu <=3)){
                System.out.println("메뉴 잘못 선택. 종료 0");
                continue;
            }

            for (; ; ) {
                System.out.println("계산 값 입력 계산종료 0, 전체 종료 99");
                tmp = sc.nextLine();
                num = Integer.parseInt(tmp);

                if (num == 0)
                    break;
                if(num ==99)
                    break outer;

                switch (menu) {
                    case 1:
                        System.out.println("result=" + num*num);
                        break;
                    case 2:
                        System.out.println("result=" + Math.sqrt(num));
                        break;
                    case 3:
                        System.out.println("result=" + Math.log(num));
                        break;
                }
            }
        }
    }
}
