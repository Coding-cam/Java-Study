package exeFile.실습코드.서연.Ch4;

import java.util.Scanner;

public class FlowEx17 {
    public static void main(String[] args) {
        int num = 0;
        System.out.println("* 라인수 입력");

        Scanner sc = new Scanner(System.in);
        String tmp = sc.nextLine();
        num = Integer.parseInt(tmp);

        for(int i =0;i<num;i++){
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
