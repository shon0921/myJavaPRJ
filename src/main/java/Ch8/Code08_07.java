package Ch8;
abstract class Rabbit7 {
    String shape;
    int xPos;
    int yPos;
    
    void move(int x, int y){
        this.xPos = x;
        this.yPos = y;
    }
}

class HR extends Rabbit7{
    
}

class MR extends Rabbit7{
    
}
public class Code08_07 {
    public static void main(String[] args){
        //Rabbit7 rabbit = new Rabbit7();
        HR hRabbit = new HR();
        System.out.println("집토끼 객체 생성");
        MR mRabbit = new MR();
        System.out.println("산토끼 객체 생성");
        
    }
}
