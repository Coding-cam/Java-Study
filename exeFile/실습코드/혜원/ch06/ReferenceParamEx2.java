package exeFile.실습코드.혜원.ch06;

public class ReferenceParamEx2 {
    static void change(Data d) {
        d.x = 1000;
        System.out.println("change : " + d.x);

    }

    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println(d.x);

        change(d);
        System.out.println(d.x);
    }
}
