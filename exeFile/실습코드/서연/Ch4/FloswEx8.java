package exeFile.실습코드.서연.Ch4;

import java.util.Scanner;

public class FloswEx8 {
    public static void main(String[] args) {
        System.out.println("주민번호 입력(012345-1111222");

        Scanner sc = new Scanner(System.in);
        String regNo = sc.nextLine();

        char gender = regNo.charAt(7);

        switch(gender){
            case '1' : case '3':
                System.out.println("남자");
                break;
            case '2' : case '4':
                System.out.println("여자");
                break;
            default:
                System.out.println("유효하지 않은 번호");
        }
    }
}
