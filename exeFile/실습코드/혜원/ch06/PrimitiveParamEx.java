package exeFile.실습코드.혜원.ch06;

class Data {
    int x;
}

public class PrimitiveParamEx {
    static void change(int x) {
        x = 1000;
        System.out.println("change : " + x);

    }

    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println(d.x);

        change(d.x);
        System.out.println(d.x);
    }
}
