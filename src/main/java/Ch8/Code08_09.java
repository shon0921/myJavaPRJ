package Ch8;
interface  Rabbit10{
    abstract void sleep();
}
class HR2 implements Rabbit10{
    public void sleep(){
        System.out.println("집토끼가 우리에서 잠자고 있습니다.");
    }
}

class MR2 implements Rabbit10{
    public void sleep() {
        System.out.println("산토끼가 굴속에서 잠자고 있습니다.");
    }
}
public class Code08_09 {
    public static void main(String[] args) {
        HR2 hRabbit = new HR2();
        MR2 mhabbit = new MR2();

        hRabbit.sleep();
        mhabbit.sleep();
    }
}
