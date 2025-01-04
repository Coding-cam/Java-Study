package exeFile.객체지향_프로그래밍.서연.Old;

public class VarArgsEx {
    public static void main(String[] args) {
        String[] strArr = {"100","200","300"};
        System.out.println(concatenate("","100","200","300"));
        System.out.println(concatenate("-",strArr));

    }

    static String concatenate(String delim, String... args){
        String result = "";

        for(String str : args){
            result += str + delim;
        }

        return result;
    }
}
