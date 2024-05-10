package Other2;

class Rabbit{

    String shape;
    int xPos;
    int yPos;

    Rabbit(String value) {this.shape =value;}
    void setPosition(int x,int y)
    {
        this.xPos=x;
        this.yPos=y;

    }
}

public class a {
    public static void main(String[] args) {
        Rabbit rabbit1 = new Rabbit("원");
        Rabbit rabbit2 = new Rabbit("토끼");
        Rabbit rabbit3 = new Rabbit("새");

        rabbit1.setPosition(100 ,-100);
        rabbit2.setPosition(200,100);
        rabbit3.setPosition(300,150);

        System.out.printf("토끼1 객체의 모양은 [%s]입니다. \n",rabbit1.shape);
        System.out.printf("토끼2 객체의 모양은 [%s]입니다. \n",rabbit2.shape);
        System.out.printf("토끼3 객체의 모양은 [%s]입니다. \n",rabbit3.shape);
    }
}
