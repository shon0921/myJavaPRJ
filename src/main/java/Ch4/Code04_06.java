package Other2;

public class Code04_06 {
    public static void main(String[] args) {
        System.out.printf("%d / %d = %3.1f", 100, 200, 0.5); // 3자리를 준비하고 소숫점 아래는 1자리만

        System.out.printf("%d", 123); // 정수의 자릿 수만큼 출력
        System.out.println();
        System.out.printf("%5d", 123); // 다섯자리 확보 후 오른쪽 정렬 
        System.out.println();
        System.out.printf("%05d", 123); // 다섯자리 확보 후 오른쪽 정렬 빈칸 0으로 채우기
        System.out.println();

        System.out.printf("난생처음 자바 \n");
        System.out.printf("%20s", "난생처음 자바 \n"); // 자릿수 지정
    }
}
