package Ch11;

public class Code11_06 {
    public static void main(String[] args) {

        int[] ary = {10, 20, 30};

        try{
            ary[3] = 1234;
        } catch (Exception e) { //마지막에는 사용할 것 , 무조건 에러를 잡음
            System.out.println("오류 발생! 확인해 보세요~");
        }
    }
}
