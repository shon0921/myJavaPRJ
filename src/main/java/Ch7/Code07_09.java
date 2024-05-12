package Ch7;
class Rabbit4 {
    String shape;
    int xPos;
    int yPos;

    void setPosition(int x, int y) {
        xPos = x;
        yPos = y;
        System.out.println("xPos : "+ this.xPos+" yPos : "+ this.yPos);
    }
}

public class Code07_09 {
    public static void main(String[] args) {
        Rabbit4 rabbit1 = new Rabbit4();
        Rabbit4 rabbit2 = new Rabbit4();
        Rabbit4 rabbit3 = new Rabbit4();

        rabbit1.shape = "원";
        rabbit2.shape = "삼각형";
        rabbit3.shape = "토끼";

        rabbit1.setPosition(100,100);
        rabbit2.setPosition(-100,100);
        rabbit3.setPosition(0,-100);
    }
}
