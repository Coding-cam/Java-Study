package exeFile.객체지향_프로그래밍.서연;

public class OverloadingTest {
    public static void main(String[] args) {
        MyMath3 mm = new MyMath3();
        System.out.println("1 : " + mm.add(3,3));
        System.out.println("2 : " + mm.add(3L,3));
        System.out.println("3 : "+ mm.add(3,3L));
        System.out.println("4 : " + mm.add(3L,3L));

        int[] a = {100, 200, 300};
        System.out.println("add : " + mm.add(a));

    }
}

class MyMath3{
    int add(int a, int b){
        System.out.println("int add - ");
        return a + b;
    }

    long add(int a, long b){
        System.out.println("long int, long - ");
        return a+b;
    }

    long add(long a, int b){
        System.out.println("long long, int - ");
        return a+ b;
    }

    long add(long a, long b){
        System.out.println("long long, long - ");
        return a + b;
    }

    int add(int[] a){
        System.out.println("int add(int[]) ");
        int result = 0;
        for(int i=0; i<a.length; i++){
            result += a[i];
        }
        return result;
    }
}
