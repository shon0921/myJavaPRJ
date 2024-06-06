package Other2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TTT {
    public static void main(String[] args) throws IOException { //필수

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 등록
        String s = br.readLine(); // 값 입력 문자열
        int i = Integer.parseInt(br.readLine()); // 값 입력 정수
        System.out.println(s);
        System.out.println(i);

        int k = Integer.parseInt(s); // 정수로 변환
        System.out.println(k);
    }
}