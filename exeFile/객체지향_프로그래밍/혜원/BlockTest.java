package exeFile.객체지향_프로그래밍.혜원;

public class BlockTest {

    static {
        System.out.println("static {}");
    }

    {
        System.out.println("{}");
    }

    public BlockTest() {
        System.out.println("생성자");
    }

    public static void main(String[] args) {
        System.out.println("test1");
        BlockTest bt = new BlockTest();

        System.out.println("test2");
        BlockTest bt2 = new BlockTest();
    }
}
