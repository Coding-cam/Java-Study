package exeFile.객체지향_프로그래밍.서연;

public class ReferenceReturnEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;

        Data d2 = copy(d);
        System.out.println("d.x " + d.x);
        System.out.println("d.x2 " + d2.x);
    }

    static Data copy(Data d){
        Data tmp = new Data();
        tmp.x = d.x;
        return tmp;
    }
}
