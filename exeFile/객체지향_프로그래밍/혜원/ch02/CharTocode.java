package exeFile.객체지향_프로그래밍.혜원.ch02;

public class CharTocode {
    public static void main(String[] args) {
        char ch = 'A';
        int code = (int) ch;

        // #X 유니코드
        System.out.printf("%c=%d(%#X)%n", ch, code, code);              //A=65(0X41)

        char hch = '가';
        System.out.printf("%c=%d(%#X)%n", hch, (int) hch, (int) hch);   //가=44032(0XAC00)
    }
}
