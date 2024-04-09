package Ch3;

import java.awt.*;

// 손해성
// 집을 만드는 거북이
// up down 활용
//
public class Ex03_01 {
    public static void main(String[] args) {

        Turtle turtle = new Turtle(-110,120);
        turtle.right(180);
        turtle.speed(300);

        turtle.forward(100);
        turtle.up();
        turtle.backward(100); //가로
        turtle.down();

        turtle.left(45);
        turtle.forward(100);
        turtle.up();
        turtle.backward(100);
        turtle.down();

        turtle.left(90);
        turtle.forward(100);
        turtle.up();
        turtle.backward(100);
        turtle.down();

        turtle.left(45);
        turtle.forward(100);

        turtle.up();
        turtle.setPosition(100,120,90);

        turtle.down();
        turtle.forward(100);
        turtle.up();
        turtle.backward(100);
        turtle.down();
        turtle.backward(100);

        turtle.up();
        turtle.setPosition(30,-90,90);

        turtle.down();
        turtle.forward(45);
        turtle.backward(90);

        turtle.left(90);
        turtle.forward(90);

        turtle.right(90);
        turtle.forward(90);
        turtle.backward(45);

        turtle.right(90);
        turtle.forward(90);
        turtle.backward(45);

        for (int a =0;a < 100 ; a ++)
        {
        turtle.right(90);
        turtle.fillColor(Color.blue);
        turtle.right(90);
        turtle.fillColor(Color.red);

        }
    }
}
