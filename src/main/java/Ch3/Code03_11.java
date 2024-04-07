package Ch3;

public class Code03_11 {
    public static void main(String[] args) {
        int n1 = 100, n2 = 200;

        System.out.print(n1 == n2); // 두 값이 같으면 참
        System.out.println(n1 != n2); // 두 값이 다르면 거짓

        System.out.print(n1>n2); // 왼쪽값이 오른쪽 값보다 더 크면 참
        System.out.println(n1<n2); // 반대로 오른쪽 값이 더 크면 참

        System.out.print(n1>=n2); // 왼쪽 값이 더 크거나 같으면 참
        System.out.println(n1<=n2); // 오른쪽 값이 더 크거나 같으면 참
    }
}
