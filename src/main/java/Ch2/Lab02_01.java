package Ch2;

import java.util.Scanner;

public class Lab02_01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String Name,address;
        int w;

        System.out.println("## 택배 보내기입니다. 다음을 각각 입력하세요. ##");
        System.out.print("받는 사람 : ");
        Name = s.nextLine();
        System.out.print("주소 : ");
        address = s.nextLine();
        System.out.print("무게 (g): ");
        w = s.nextInt();

        System.out.println("** 받는 사람 ==>"+Name);
        System.out.println("** 주소 ==>"+address);
        System.out.println("** 배송비 ==>"+w);

        s.close();
    }
}
