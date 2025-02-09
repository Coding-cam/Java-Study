package exeFile.실습코드.혜원.ch05;

public class ArrayEx12 {
    public static void main(String[] args) {
        String[] names = {"Kim", "Park", "Yi"};

        for(int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }

        String tmp = names[2];
        System.out.println(tmp);
        names[0] = "Yu";

        for(int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }
    }
}
