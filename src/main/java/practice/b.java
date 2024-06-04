package Other2;

import java.util.ArrayList;
import java.util.List;

public class b {
    public static void main(String[] args) {
        List <Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);

        int list = a.size();

        for(int i =0; i<list;i++)
        {
            System.out.println(a.get(i));
        }

        for(Integer b : a){
            System.out.println(b);
        }

        a.forEach(i -> System.out.println(i));
    }
}
