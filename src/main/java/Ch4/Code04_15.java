package Other2;

public class Code04_15 {
    public static void main(String[] args) {
        String str = "난생처음 자바를 처음 학습 중입니다. 자바는 처음이지만 재미있네요.";

        System.out.println(str.indexOf("처음")); // '처음' 처음 나오는 위치 반환 2
        System.out.println(str.indexOf("처음"));
        System.out.println(str.indexOf("처음",4)); // 4번 글자부터 시작
    }
}
