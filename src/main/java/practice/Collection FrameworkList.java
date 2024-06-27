import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(6);
        numbers.add(1);
        numbers.add(2);
        numbers.add(4);

        // 리스트 정렬
        Collections.sort(numbers);

        // 람다식을 사용하여 정렬된 숫자 출력
        numbers.forEach(num -> System.out.print(num + ", "));
    }
}
