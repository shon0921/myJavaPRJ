package Ch2;

import java.util.Scanner;

public class Lab02_02 {
    public static void main(String[] args) {
        int num1,num2;
        int result;
        double resultd;

        Scanner i = new Scanner(System.in);
        System.out.print("정수1 ==>");
        num1 = i.nextInt();
        System.out.print("정수2 ==>");
        num2 = i.nextInt();

        result = num1 + num2;
        System.out.println(num1+"+"+num2+"="+result);
        result = num1 - num2;
        System.out.println(num1+"-"+num2+"="+result);
        result = num1 * num2;
        System.out.println(num1+"x"+num2+"="+result);
        resultd = (double) num1 / num2;
        System.out.println(num1+"/"+num2+"="+resultd);
        result = num1 % num2;
        System.out.println(num1+"%"+num2+"="+result);

        i.close();

    }
}
