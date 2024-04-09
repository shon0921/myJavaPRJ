package Ch6;

import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        if (a>b)
        {
            for(int i = a;i>=b;i--)
            {
                System.out.println(i);
            }
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
