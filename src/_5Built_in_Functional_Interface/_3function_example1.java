package _5Built_in_Functional_Interface;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 Function<T,T> functional interface:


 --we can give input type(argument type) and output type(return type)

 methods:
 apply()   --> abstract method
 andThen()
 compose()
 identity()
 **/


public class _3function_example1 {
    public static void main(String args[]){
        Function<Integer,Integer> f1 = (n) -> {return (n + 5);};
        Function<Integer,Integer> f2 = (n) -> {return (n * 5);};

        System.out.println(f1.apply(5));

        System.out.println(f1.andThen(f2).apply(5));
        System.out.println(f2.andThen(f1).apply(5));

        System.out.println(f1.compose(f2).apply(6));
        System.out.println(f2.compose(f1).apply(6));


        Function<Integer,Integer> f3 = Function.identity();
        System.out.println(f3.apply(5));


    }
}
