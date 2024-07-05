package _5Built_in_Functional_Interface;

import java.util.ArrayList;
import java.util.function.Consumer;

public class _1consumer_example2 {
    public static void main(String args[]){
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(10);
        a1.add(20);
        a1.add(30);
        a1.add(40);

        Consumer<ArrayList<Integer>> c1 = (ArrayList<Integer> li) -> {
            for(int i=0; i<a1.size(); i++)
            {
                a1.set(i, 5*a1.get(i));
            }
            a1.forEach((Integer a) -> System.out.println(a));
        };
        c1.accept(a1);
    }
}
