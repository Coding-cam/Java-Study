package exeFile.객체지향_프로그래밍.서연;

class Card {
    String kind;
    int number;

    static int width = 100;
    static int height = 250;
}

public class CardTest {
    public static void main(String[] args) {
        System.out.println("card width : " + Card.width);
        System.out.println("card height : " + Card.height);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("c1 " + c1.kind + " " + c1.number + " width/height : " + c1.width + " / " + c1.height);
        System.out.println("c2 " + c2.kind + " " + c2.number + " width/height : " + c2.width + " / " + c2.height);
    }
}
