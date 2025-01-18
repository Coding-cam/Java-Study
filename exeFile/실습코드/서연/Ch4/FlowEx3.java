package exeFile.실습코드.서연.Ch4;

import java.util.Scanner;

public class FlowEx3 {
    public static void main(String[] args) {
        int input;

        System.out.print("입력 >");

        Scanner sc = new Scanner(System.in);
        String tmp = sc.nextLine();
        input = Integer.parseInt(tmp);

        if(input==0){
            System.out.println("입력한 숫자는 0");
        }else {
            System.out.println("0아님");
            System.out.printf("입력 숫자 %d", input);
        }
    }
}
