package exeFile.실습코드.서연.Ch4;

public class FlowEx13 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
            System.out.printf("1 ~ %2d 까지의 합 : %2d%n",i,sum);
        }
    }
}
