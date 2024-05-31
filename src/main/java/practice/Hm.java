package Test;

interface legs{
    void move();
}
interface Arms{
    void back();
}
interface Head{
    void head();
}

class H implements legs,Arms,Head {
    @Override
    public void move() {
        System.out.println("사람이 움직입니다");
    }

    @Override
    public void back() {
        System.out.println("사람이 팔을 돌립니다");

    }

    @Override
    public void head() {
        System.out.println("사람이 머리를 돌립니다");
    }
}
public class Hm {
    public static void main(String[] args) {
        H h = new H();
        h.back();
        h.head();
        h.move();
    }
}
