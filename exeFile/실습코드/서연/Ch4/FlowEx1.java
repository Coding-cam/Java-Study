package exeFile.실습코드.서연.Ch4;

public class FlowEx1 {
    public static void main(String[] args) {
        int x = 0;
        System.out.printf("x=%d, %n",x);

        if (x==0) System.out.println("x==0");
        if (x!=0) System.out.println("x !=0");
        if (!(x==0)) System.out.println("!(x==0)'");
        if (!(x!=0)) System.out.println("!(x!=0)");

        x = 1;
        System.out.printf("x=%d, %n",x);
        if (x==0) System.out.println("x==0");
        if (x!=0) System.out.println("x !=0");
        if (!(x==0)) System.out.println("!(x==0)'");
        if (!(x!=0)) System.out.println("!(x!=0)");
    }
}
