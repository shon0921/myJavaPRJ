import java.util.Scanner;

public class T {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); //스캐너 생성

        int num1 = s.nextInt(); //num1 선언 후 입력된 값 대입
        int num2 = s.nextInt(); //num2 선언 후 입력된 값 대입
        int sum; //sum 선언
        sum = num1+num2; // sum 값에 num1 num2 더 한값 대입
        int sum2 = 0;// sum2 선언 0 대입

        for(int i=num1;i<=sum;i++) // for 반복문 선언 (int i 선언 num1의 값 대입; i가 sum값 보다 작거나 같을 경우 반복 ; 반복 후 i값 1증가
        {
            if(i%2!=0)  // i가 2로 나누었을때 나머지 0이 아닐경우 작동
            {
                sum2 += i; // sum2 값에 i 더하기
            }
        }

        System.out.println("합계 "+sum2); // sum2
    }
}
