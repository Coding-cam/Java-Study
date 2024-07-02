package exeFile.객체지향_프로그래밍.서연;

class Data {int x;}
public class PrimitiveParamEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main x " + d.x);

        change(d.x);
        System.out.println("After change d.x  " + d.x);

        changeData(d);
        System.out.println("After changeData d.x " + d.x);
    }
    static void change(int x){
        x = 1000;
        System.out.println("change " + x);
    }

    static void changeData (Data d){
        d.x = 1000;
        System.out.println("changeData " + d.x);
    }
}
