package Test;

class Rabbit{
    private String color;
    public void color(String color)
    {

    }
}

class HR extends Rabbit{
    @Override
    public void color(String color) {
        System.out.printf("토끼의 색은 %s입니다",color);
    }
}
public class TEST1 {
    public static void main(String[] args) {
        HR r = new HR ();
        r.color("노란색");

    }
}
