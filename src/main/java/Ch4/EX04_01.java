package Ch4;

import Ch2.Turtle;

import java.util.Scanner;

public class EX04_01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Turtle turtle = new Turtle();

        double x,y;
        int tsize;
        String color;
        turtle.up();

        while (true)
        {
            System.out.print("X 위치 (-200 ~ +200) ==> ");
            x = s.nextInt();
            System.out.print("Y 위치 (-200 ~ +200) ==> ");
            y = s.nextInt();
            System.out.print("스탬프 크기(1~100) ==> ");
            tsize = s.nextInt();
            System.out.print("스탬프 색상(red, green, blue, black, yellow) ==> ");
            color = s.next();

            turtle.setPosition(x,y);
            turtle.shapeSize(tsize,tsize);
            turtle.outlineColor(color);
            turtle.fillColor(color);
            turtle.stamp();

        }


    }
}
