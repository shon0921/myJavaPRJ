package Test2;
class Tree2{
    private String color;
    void setTree(String color) {
     color = color;
    }
}
class AppleTree extends Tree2{
    @Override
    void setTree(String color) {
        super.setTree(color);
        System.out.println(color+"색상으로 설정합니다");
    }
}
public class Appletree3 {
    public static void main(String[] args) {

    }
}
