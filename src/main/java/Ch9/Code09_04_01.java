package Ch9;

public class Code09_04_01 {
    public static void main(String[] args) {
        int[] ary1 = {100,200,300,400};
        int[] ary2 = new int[] {100,200,300};
        int[] ary3;
        ary3= new int[] {100,200};
        int[] ary4 = new int[1];
        ary4[0] = 100;

        for(int i:ary1){
            System.out.printf("ary1==>%d\t", i, ary1[i]);
        }
        for(int i:ary2){
            System.out.printf("ary1==>%d\t", i, ary2[i]);
        }
        for(int i:ary3){
            System.out.printf("ary1[%d]==>%d\t", i, ary3[i]);
        }
        for(int i:ary4){
            System.out.printf("ary1[%d]==>%d\t", i, ary4[i]);
        }
    }
}
