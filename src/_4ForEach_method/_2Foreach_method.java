package _4ForEach_method;

import java.lang.constant.Constable;
import java.util.ArrayList;
import java.util.function.Consumer;

/** forEach method without lambda expression of consumer **/

public class _2Foreach_method {
    public static void main(String args[]){
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(10);
        a1.add(20);
        a1.add(30);
        a1.add(40);
        a1.add(50);

        Consumer<Integer> c = new Consumer<Integer>() {

            public void accept(Integer n) {
                System.out.println(n);
            }
        };

        a1.forEach(c);

    }
}
