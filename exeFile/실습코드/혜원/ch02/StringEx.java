package exeFile.실습코드.혜원.ch02;

public class StringEx {
    public static void main(String[] args) {
        String name = "Ja" + "va";
        String str = name + 8.0;

        System.out.println(name);       //Java
        System.out.println(str);        //Java8.0
        System.out.println(7 + " ");    //7
        System.out.println(" " + 7);    // 7
        System.out.println(7 + "");     //7
        System.out.println("" + 7);     //7
        System.out.println("" + "");    //\n
        System.out.println(7 + 7 + ""); //14
        System.out.println("" + 7 + 7); //77
    }
}
