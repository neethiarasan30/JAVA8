package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class _2ForEach_method {
    public static void main(String args[]){
        List<Integer> a1 = Arrays.asList(4,5,2,7,10);

        //creating anonymous class of consumer
        Consumer<Integer> c = new Consumer<Integer>() {

            public void accept(Integer x) {
                System.out.println(x);
            }
        };

        a1.forEach(c);

        //consumer is a functional interface so we can create lambda expression for its reference
        Consumer<Integer> c1 = x -> System.out.println(x);

        a1.forEach(c1);



        //passing lambda expression inside the argument of foreach method without reference
        a1.forEach((x) -> System.out.println(x));

    }
}
