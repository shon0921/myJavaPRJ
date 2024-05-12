package Other2;
class Rabbit2{
    String t;
    int xpos;
    int ypos;

    Rabbit2(String v) {this.t=v;}
    void set(int x,int y)
    {
        this.xpos=x;
        this.ypos=y;
        System.out.println("토끼위치 "+xpos+" "+ypos);
    }
}

public class a2 {
    public static void main(String[] args) {
        Rabbit2 rabbit1 = new Rabbit2("1");
        Rabbit2 rabbit2 = new Rabbit2("yee");

        rabbit1.set(100, 100);
        rabbit1.set(200,300);



        System.out.printf("토끼 [%s]",rabbit1.t);
        System.out.printf("토끼 [%s]",rabbit2.t);
    }
}
