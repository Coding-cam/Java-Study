package exeFile.실습코드.혜원.ch06;

class Card {
    String kind;
    int number;
    static int width = 100;
    static int height = 250;

    @Override
    public String toString() {
        return "종류 :" + kind + ", 숫자 :" + number + ", width :" + width + ", height :" + height;
    }
}

public class CardTest {


    public static void main(String[] args) {
        System.out.println(Card.width);
        System.out.println(Card.height);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("c1 > " + c1.toString());
        System.out.println("c2 > " + c2.toString());

        c1.width = 50;
        c1.height = 80;
        System.out.println("c1 > " + c1.toString());
        System.out.println("c2 > " + c2.toString());
    }
}
