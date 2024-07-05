package _5Built_in_Functional_Interface;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class _5bi {
    public static void main(String args[]){

        /** bi-predicate **/

        BiPredicate<Integer,Integer> bp = (Integer x, Integer y) -> x+y > 10;
        System.out.println(bp.test(5,6));

        /** bi-consumer **/
        BiConsumer<Integer, Integer> bc = (Integer x, Integer y) -> System.out.println(x+y);
        bc.accept(5,15);

        /** bi-function **/
        BiFunction<Integer,Integer,Integer> bf = (Integer x, Integer y) -> {return (x+y)/10;};
        System.out.println(bf.apply(50,50));
    }
}
