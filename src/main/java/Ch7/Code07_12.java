package Ch7;
class Rabbit7 {
    private String shape;
    private int xPos;
    private int yPos;

    void setPosition(int x, int y) {
        this.xPos = x;
        this.yPos = y;
    }
}

public class Code07_12 {
    public static void main(String[] args) {
        Rabbit7 rabbit7 = new Rabbit7();

        rabbit7.setPosition(100,200);
        Rabbit7 s = new Rabbit7();
        s.xPos=10;
    }
}
