package Other2;

interface a1{
    void move();
}
interface b1{
    void move2();
}

interface c1{
    void move3();
}
class M implements  a1,b1,c1{
    @Override
    public void move2() {
        System.out.println("이동2");
    }
    @Override
    public void move3() {
        System.out.println("이동3");
    }

    @Override
    public void move() {
        System.out.println("이동2");
    }
}
public class a4 {
    public static void main(String[] args) {
        M m = new M();

        m.move();
        m.move2();
        m.move3();
    }
}
