package Other2;

public class Code03_12 {
    public static void main(String[] args) {
        int num = 99;

        System.out.println( (num>100) && (num<200)); // 둘다 참이여만 참
        System.out.println((num==99)||(num==100)); // 하나만 참이여도 참
        System.out.println(!(num==100)); // 참이면 거짓 거짓이면 참
    }
}
