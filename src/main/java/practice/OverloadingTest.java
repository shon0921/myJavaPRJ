class OverloadTest{
    void c() {
        System.out.println("123");
    }
    void c(int a){
        System.out.println(a);
    }
    void c(int a,int b){
        System.out.println(a+b);
    }
}

public class C {
    public static void main(String[] args) {
      OverloadTest ot = new OverloadTest();

      ot.c();
      ot.c(1);
      ot.c(1,2);

    }
}
