package Ch6;

import java.util.Scanner;

public class T3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c=0;

        if (a>b)
        {
            for(int i = a;i>=b;i--)
            {
                if (i % 3 == 0)
                {
                    c += i;
                }
                System.out.println(i);
            }
            System.out.println("3의 배수 합 "+c);
        }
        else
        {
            for(int i = a; i<=b; i++)
            {
                System.out.println(i);
            }
        }

    }
}
