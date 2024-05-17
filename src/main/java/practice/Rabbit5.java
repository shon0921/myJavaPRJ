class Rabbit{
    int xPos;
    int yPos;
    static int count;

    Rabbit(){
        count++;
    }
    void move(int x, int y){
        this.xPos = x;
        this.yPos = y;
    }
}

class HouseRabbit extends Rabbit{
    void move(int x, int y){
        this.xPos = x;
        this.yPos = y;

        if(this.xPos>100)
            this.xPos = 100;
        if (this.yPos>100)
            this.yPos = 100;
    }
}
class MountainRabbit extends Rabbit{

}
public class a {
    public static void main(String[] args) {
        HouseRabbit Rabbit1 = new HouseRabbit();
        MountainRabbit Rabbit2 = new MountainRabbit();

        Rabbit1.move(300,300);
        Rabbit2.move(300,300);

        System.out.printf("총 토끼 수 %d \n",Rabbit.count);

        System.out.printf("집토끼 위치 %d %d\n",Rabbit1.xPos,Rabbit1.yPos);
        System.out.printf("산토끼 위치 %d %d",Rabbit2.xPos,Rabbit2.yPos);
    }
}
