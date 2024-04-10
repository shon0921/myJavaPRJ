package Other2;

public class Code04_01 {
    public static void main(String[] args) {

        byte age = 127; // byte형 최댓값
        short birth = 32767; // short형 최댓값
        int money = 2147483647; // int형 최댓값

        System.out.println((byte)(age+1));
        System.out.println((short)(birth+1));
        System.out.println((int)(money+1));
    }
}
