package Test2;
interface Tree{
    void setTree(String color);
}

class AppleTree2 implements Tree{
    String color;
    @Override
    public void setTree(String color) {
        this.color = color;
        System.out.println(color+"색상으로 설정하였습니다");
    }
}
public class appletree2 {
    public static void main(String[] args) {

    }
}
