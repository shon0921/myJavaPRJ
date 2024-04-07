package Other2;

public class Lab03_03 {
    public static void main(String[] args) {
        int java = 3, moblie = 2, excel = 1;
        double A = 4.5, A0 = 4.0, B= 3.5;

        double avg;
        avg = ((java*B)+(moblie*A0)+(excel*A)) / +(java+moblie+excel);
        avg = Math.round(avg*100.0) / 100.0; // 소숫점 2자리까지 출력

        System.out.println("평균 학점 : "+avg);
    }
}
