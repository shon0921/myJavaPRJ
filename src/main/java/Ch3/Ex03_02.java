package Ch3;

import java.awt.*;
import java.util.Scanner;

// 손해성
// 집을 만드는 거북이
// Scanner 활용
public class Ex03_02 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        Turtle turtle = new Turtle(-110,120);
        int g,e,b;

        System.out.println("ㅈ 크기 입력 ");
        g = s.nextInt();
        System.out.println("ㅣ 크기 입력 ");
        e = s.nextInt();
        System.out.println("ㅂ 크기 입력 ");
        b = s.nextInt();


        turtle.right(180);
        turtle.speed(300);

        turtle.forward(g);
        turtle.backward(g); //가로

        turtle.left(45);
        turtle.forward(g);
        turtle.backward(g);

        turtle.left(90);
        turtle.forward(g);
        turtle.backward(g);

        turtle.left(45);
        turtle.forward(g);

        turtle.up();
        turtle.setPosition(100,120,90);

        turtle.down();
        turtle.forward(e);

        turtle.right(180);
        turtle.forward(e);
        turtle.forward(e);

        turtle.up();
        turtle.setPosition(30,-90,90);

        turtle.down();
        turtle.forward(b);
        turtle.backward(b);
        turtle.backward(b);

        turtle.left(90);
        turtle.forward(b);
        turtle.forward(b);

        turtle.right(90);
        turtle.forward(b);
        turtle.forward(b);
        turtle.backward(b);

        turtle.right(90);
        turtle.forward(b);
        turtle.forward(b);
        turtle.backward(b);

        for (int a =0;a < 100 ; a ++)
        {
        turtle.right(90);
        turtle.fillColor(Color.blue);
        turtle.right(90);
        turtle.fillColor(Color.red);

        }
    }
}
