package exeFile.실습코드.서연.Old;



public class TvTest2 {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();
        System.out.println(t1.channel + "   t1.channel");
        System.out.println(t2.channel + "   t2.channel");

        t1.channel = 7;
        System.out.println(t1.channel + "   change t1.channel");

        System.out.println(t1.channel + "   final t1.channel");
        System.out.println(t2.channel + "   final t2.channel");

        t1.channel = 0;
        t2 = t1; //t1 주소값을 T2에 저장
        t1.channel = 7;
        System.out.println(t1.channel + "   final3 t1.channel");
        System.out.println(t2.channel + "   final3 t2.channel");

        t1.channel = 3;
        System.out.println(t1.channel + "   final4 t1.channel");
        System.out.println(t2.channel + "   final4 t2.channel");

        // TvTest4
        Tv[] tvArr = new Tv[3];
        for (int i=0; i< tvArr.length; i++){
            tvArr[i] = new Tv();
            tvArr[i].channel = i + 10;
        }

        for(int i=0; i<tvArr.length; i++){
            tvArr[i].channelUp();
            System.out.println(tvArr[i].channel + " i " + i);
            System.out.printf("tvArr[%d].channel=%d%n",i,tvArr[i].channel);
        }
    }
}
