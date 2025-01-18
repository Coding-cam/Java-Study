package exeFile.실습코드.서연.Ch3;

import java.util.Arrays;

public class OperatorEx2 {
    public static void main(String[] args) {
        int i=5, j=0;
        j = i++;
        System.out.println("i++ + j = " + i + j);

        i =5;
        j=0;

        j = ++i;
        System.out.println("++i + j = " + i + j);
    }
}
