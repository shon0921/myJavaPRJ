package Ch7;
class Rabbit3 {
    String shape;
    int xPos;
    int yPos;

    void setPosition(int x, int y) {
        xPos = x;
        yPos = y;
    }
}

public class Code07_08 {
    public static void main(String[] args) {
        Rabbit3 rabbit1 = new Rabbit3();
        Rabbit3 rabbit2 = new Rabbit3();
        Rabbit3 rabbit3 = new Rabbit3();

        rabbit1.shape = "원";
        rabbit2.shape = "삼각형";
        rabbit3.shape = "토끼";
    }
}
