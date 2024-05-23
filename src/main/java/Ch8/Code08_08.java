package Ch8;

abstract class Rabbit9{
    int xPos;
    int yPos;

    void move(int x,int y) {
        this.xPos = x;
        this.yPos = y;
    }

    abstract void sleep();
}
class HR1 extends Rabbit9{
    @Override
    void sleep() {
        System.out.println("집토끼가 우리에서 잠자고 있습니다");
    }
}

class MR1 extends Rabbit9{
    @Override
    void sleep(){
        System.out.println("산토끼가 굴속에서 잠자고 있습니다.");
    }
}
public class Code08_08 {
    public static void main(String[] args) {
        HR1 hRabbit = new HR1();
        MR1 mRabbit = new MR1();

        hRabbit.sleep();
        mRabbit.sleep();
    }
}
