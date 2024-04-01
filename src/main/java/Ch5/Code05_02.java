package Ch5;

import java.util.Scanner;

public class Code05_02 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int num;
        num=n.nextInt();

        if(num<100){
            System.out.println("100보다");
            System.out.println("작습니다");
        }
    }
}
